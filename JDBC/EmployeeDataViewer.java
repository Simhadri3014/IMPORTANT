import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDataViewer
 {
   public static void main(String[] args)
    {
      String url = "jdbc:mysql://192.168.206.130:3306/ENHisecure?useSSL=false";
      String username = "nani";
      String password = "Nani@1234";

      try 
       {
        // Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection(url, username, password);
         System.out.println("Connection Successful!");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
         while (rs.next())
          {
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            String employeeID = rs.getString("EmployeeID");
            String email = rs.getString("Email");
            String designation = rs.getString("Designation");
            String department = rs.getString("Department");
            String location = rs.getString("Location");
            System.out.println("Employee: " + firstName + " " + lastName + ", ID: " + employeeID + ", Email: " + email + ", Designation: " + designation + ", Department: " + department + ", Location: " + location);
          }
         rs.close();
         stmt.close();
         conn.close();
       }
      //catch (ClassNotFoundException e)
     //  {
     //    System.out.println("MySQL JDBC Driver not found!");
    //     e.printStackTrace();
   //    } 
      catch (SQLException e)
       {
         System.out.println("Connection Failed!");
         e.printStackTrace();
       }
    }
 }

 