import java.util.Scanner;

public class ModuloCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first operand: ");
            String operand1 = scanner.nextLine();

            System.out.print("Enter the second operand: ");
            String operand2 = scanner.nextLine();

            int result = calculateModulo(operand1, operand2);
            System.out.println("Result of modulo calculation: " + result);
        } catch (NonNumericOperandException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to calculate modulo and throw custom exception for non-numeric operands
    private static int calculateModulo(String operand1, String operand2)
            throws NonNumericOperandException, ArithmeticException {
        try {
            int num1 = Integer.parseInt(operand1);
            int num2 = Integer.parseInt(operand2);

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            return num1 % num2;
        } catch (NumberFormatException e) {
            throw new NonNumericOperandException("Non-numeric operand detected.");
        }
    }
}
