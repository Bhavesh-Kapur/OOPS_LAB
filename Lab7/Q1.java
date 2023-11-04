class NonNumericOperandException extends Exception {
    public NonNumericOperandException(String message) {
        super(message);
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Check if the correct number of arguments (operands and operator) is provided.
        if (args.length != 3) {
            System.out.println("Usage: Calculator <operand1> <operator> <operand2>");
            System.exit(1);
        }

        try {
            // Parse the command-line arguments into operands and operator.
            double operand1 = Double.parseDouble(args[0]);
            double operand2 = Double.parseDouble(args[2]);
            String operator = args[1];

            // Calculate the result and display it.
            double result = calculate(operand1, operator, operand2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            // Handle the case when a non-numeric operand is provided.
            System.out.println("Error: Non-numeric operand detected. Please enter valid numeric operands.");
        } catch (NonNumericOperandException e) {
            // Handle the custom exception for non-numeric operators.
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Perform the arithmetic calculation based on the provided operator.
    public static double calculate(double operand1, String operator, double operand2) throws NonNumericOperandException {
        if (!isNumeric(operator)) {
            // Throw a custom exception if the operator is non-numeric.
            throw new NonNumericOperandException("Operator is non-numeric.");
        }

        // Perform the appropriate arithmetic operation based on the operator.
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    // Ensure no division by zero occurs.
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                // Throw a custom exception for an invalid operator.
                throw new NonNumericOperandException("Invalid operator.");
        }
    }

    // Check if a string represents a numeric value (integer or decimal).
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}