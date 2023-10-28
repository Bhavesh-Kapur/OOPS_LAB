//Create a database of employee of company in mysql and then use java program to access the database for inserting information of employees in database. The SQL statement can be used to view the details of the data of employees in the database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");

            // Create a statement object
            statement = connection.createStatement();

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            // Insert data into the employees table
            String insertDataSQL = "INSERT INTO employee (first_name, last_name, email, department, salary) " +
                    "VALUES ('" + firstName + "', '" + lastName + "', '" + email + "', '" + department + "', " + salary + ")";
            int rowsAffected = statement.executeUpdate(insertDataSQL);

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
