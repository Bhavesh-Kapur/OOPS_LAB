//Create a database table to store the records of employee in a company. Use getConnection function to connect the database. The statement object uses executeUpdate function to create a table.



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
  public static void main(String[] args) {
      Connection connection = null; // Create a connection object and initialize it to null
      Statement statement = null; // Create a statement object and initialize it to null

      try {
          // Connect to the database
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");

          // Create a statement object
          statement = connection.createStatement();

          // Create the employees table
          String createTableSQL = "CREATE TABLE IF NOT EXISTS employee (" +
                  "id INT AUTO_INCREMENT PRIMARY KEY," +
                  "first_name VARCHAR(50) NOT NULL," +
                  "last_name VARCHAR(50) NOT NULL," +
                  "email VARCHAR(100) UNIQUE NOT NULL," +
                  "department VARCHAR(50)," +
                  "salary DECIMAL(10,2)" +
                  ")";
          int rowsAffected = statement.executeUpdate(createTableSQL);

          if (rowsAffected >= 0) {
              System.out.println("Table created successfully!"); // Print a success message if table is created
          } else {
              System.out.println("Table creation failed."); // Print a failure message if table creation fails
          }
      } catch (Exception e) {
          System.out.println("Error: " + e.getMessage()); // Print an error message if an exception occurs
          e.printStackTrace(); // Print the stack trace of the exception
      } finally {
          try {
              if (statement != null) statement.close(); // Close the statement if it's not null
              if (connection != null) connection.close(); // Close the connection if it's not null
          } catch (Exception e) {
              e.printStackTrace(); // Print the stack trace of any exceptions that occur during closing
          }
      }
  }
}








///show databases;{data base dekhne keliye}
///create database madhav;{data base create karne keliye}
/// use company {that folder open karne keliye}
/// show tables;{table dekhne ke liye}
/// select * from employees;{list dekhne keliye}