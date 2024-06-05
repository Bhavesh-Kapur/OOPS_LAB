import java.util.Scanner;

public class DivideByZeroExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for numerator and denominator
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        // Handle divide-by-zero exception
        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Method to perform division and throw divide-by-zero exception if necessary
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (numerator / denominator);
    }
}
