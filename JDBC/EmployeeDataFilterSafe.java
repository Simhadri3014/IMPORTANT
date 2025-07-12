import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class EmployeeDataFilterSafe
 {
   public static void main(String[] args)
    {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      BufferedReader reader = null;
   
      try
       {
         reader = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Enter column name to filter by (e.g., FirstName, LastName, EmployeeID, Email, Designation, Department, Location): ");
         String column = reader.readLine().trim();

         System.out.print("Enter value to match: ");
         String value = reader.readLine().trim();

         String url = "jdbc:mysql://192.168.206.130:3306/ENHisecure?useSSL=false";
         String username = "nani";
         String password = "Nani@1234";

         String query = "SELECT * FROM Employee WHERE " + column + " = ?";

         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url, username, password);
         System.out.println(" Connection Successful!");

         pstmt = conn.prepareStatement(query);
         pstmt.setString(1, value);
         rs = pstmt.executeQuery();

         boolean found = false;
         while (rs.next())
          {
            found = true;
            System.out.println("----------------------------------------");
            System.out.println("Name       : " + rs.getString("FirstName") + " " + rs.getString("LastName"));
            System.out.println("EmployeeID : " + rs.getString("EmployeeID"));
            System.out.println("Email      : " + rs.getString("Email"));
            System.out.println("Designation: " + rs.getString("Designation"));
            System.out.println("Department : " + rs.getString("Department"));
            System.out.println("Location   : " + rs.getString("Location"));
          }
         if (!found)
          {
            System.out.println(" No matching records found.");
          }
       } 
      catch (IOException e)
       {
         System.out.println("Error reading input.");
         e.printStackTrace();
       }
      catch (ClassNotFoundException e) 
       {
         System.out.println(" JDBC Driver not found.");
         e.printStackTrace();
       } 
      catch (SQLException e)
       {
         System.out.println(" Database error occurred.");
         e.printStackTrace();
       } 
      finally 
       {
         // Close ResultSet
         try
          {
            if (rs != null) rs.close();
          }
         catch (SQLException e)
          {
            System.out.println(" Error closing ResultSet.");
            e.printStackTrace();
          }
         // Close PreparedStatement
         try
          {
            if (pstmt != null) pstmt.close();
          } 
         catch (SQLException e)
          {
            System.out.println(" Error closing PreparedStatement.");
            e.printStackTrace();
          }
         // Close Connection
         try 
          {
            if (conn != null) conn.close();
            System.out.println(" Connection closed.");
          } 
         catch (SQLException e)
          {
            System.out.println(" Error while closing the connection.");
            e.printStackTrace();
          }
         // Close BufferedReader
         try 
          {
            if (reader != null) reader.close();
          } 
         catch (IOException e) 
          {
            System.out.println(" Error closing input reader.");
            e.printStackTrace();
          }
       }
    }
}
