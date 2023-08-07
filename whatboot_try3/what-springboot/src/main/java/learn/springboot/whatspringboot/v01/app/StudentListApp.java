package learn.springboot.whatspringboot.v01.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentListApp {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://172.18.0.10:3306/student_tracker";
        String user = "springstudent";
        String password = "springstudent";

        try {
            // Step 1: Connect to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            // Step 2: Create a SQL statement
            String sql = "SELECT * FROM customer";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Step 3: Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Step 4: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String LastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + firstName + " "+LastName+ ", email: " + email);
            }

            // Step 5: Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
