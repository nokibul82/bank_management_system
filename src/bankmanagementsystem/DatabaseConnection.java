
package bankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/bank?";
        
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
