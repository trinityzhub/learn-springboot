package learn.springboot.whatspringboot.v02.config;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    private static final String JDBC_URL = "jdbc:mysql://172.18.0.10:3306/student_tracker";
    private static final String USER = "springstudent";
    private static final String PASSWORD = "springstudent";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Handle the exception or log it
            }
        }
    }
}




