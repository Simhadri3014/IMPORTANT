import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection
 {
   public static void main(String[] args)
   {
     //  String url = "jdbc:mysql://192.168.206.130:3306/College?useSSL=true&verifyServerCertificate=false";

    // String url = "jdbc:mysql://192.168.206.130:3306/College";
     String url = "jdbc:mysql://192.168.206.130:3306/College?useSSL=false";

     String username = "nani";
     String password = "Nani@1234";

     try
      {
        // Step 1: Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Step 2: Establish connection
        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println(" Connection Successful!");
        // Optional: Close connection
        conn.close();
      } 
     catch (ClassNotFoundException e)
      {
        System.out.println(" MySQL JDBC Driver not found!");
        e.printStackTrace();
      }
     catch (SQLException e)
      {
        System.out.println(" Connection Failed!");
        e.printStackTrace();
      }
    }
}

 