package learn.springboot.whatspringboot.v01.app;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class StudentListAppV2 {

    public static void main(String[] args) {
        Properties properties = loadProperties("v01.properties");

        String jdbcUrl = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");

        try {
            // Step 1: Connect to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            // Step 2: Create a SQL statement
            String sql = "SELECT * FROM student";
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

    private static Properties loadProperties(String filename) {
        Properties properties = new Properties();
        try (InputStream inputStream = StudentListApp.class.getClassLoader().getResourceAsStream(filename)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
