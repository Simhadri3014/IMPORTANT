import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDataFilter 
 {
   public static void main(String[] args)
    {
      String url = "jdbc:mysql://192.168.206.130:3306/ENHisecure?useSSL=false";
      String username = "nani";
      String password = "Nani@1234";
      Scanner scanner = new Scanner(System.in);

      System.out.print(" Enter column name to filter by (e.g., FirstName, LastName, EmployeeID, Email, Designation, Department, Location): ");
      String column = scanner.nextLine();

      System.out.print(" Enter value to match: ");
      String value = scanner.nextLine();

      try
       {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(url, username, password);
         System.out.println(" Connection Successful!");

         Statement stmt = conn.createStatement();

         String query = "SELECT * FROM Employee WHERE " + column + " = '" + value + "'";

         ResultSet rs = stmt.executeQuery(query);

         System.out.println("\n Filtered Employee Records:");
         boolean found = false;
         while (rs.next())
          {
            found = true;
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            String employeeID = rs.getString("EmployeeID");
            String email = rs.getString("Email");
            String designation = rs.getString("Designation");
            String department = rs.getString("Department");
            String location = rs.getString("Location");

            System.out.println("--------------------------------------------------");
            System.out.println("Name       : " + firstName + " " + lastName);
            System.out.println("EmployeeID : " + employeeID);
            System.out.println("Email      : " + email);
            System.out.println("Designation: " + designation);
            System.out.println("Department : " + department);
            System.out.println("Location   : " + location);
          }

         if (!found)
          {
            System.out.println(" No matching records found.");
          }
         rs.close();
         stmt.close();
         conn.close();

       }
      catch (ClassNotFoundException e) 
       {
         System.out.println(" MySQL JDBC Driver not found!");
         e.printStackTrace();
       } 
      catch (SQLException e)
       {
         System.out.println(" Connection Failed or Invalid Column Name!");
         e.printStackTrace();
       }
    }
}
