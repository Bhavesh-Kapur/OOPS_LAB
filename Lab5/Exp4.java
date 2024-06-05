// Define an interface with division and modulus methods
interface MyInterface {
    // Method to perform division
    double division(double num1, double num2);

    // Method to calculate modulus
    int modulus(int num1, int num2);
}
// Implement the interface in a class
class MyImplementation implements MyInterface {
    public double division(double num1, double num2) {
        // Check if denominator is not zero before performing division
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) to indicate an error
        }
    }
    public int modulus(int num1, int num2) {
        // Check if denominator is not zero before performing modulus
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Cannot calculate modulus with zero.");
            return -1; // Return -1 to indicate an error
        }
    }
}
public class Exp4 {
    public static void main(String[] args) {
        // Create an instance of the implementing class
        MyImplementation myImplementation = new MyImplementation();

        // Test division method
        double resultDivision = myImplementation.division(10.0, 2.0);
        System.out.println("Division Result: " + resultDivision);

        // Test division method with divisor as zero
        resultDivision = myImplementation.division(5.0, 0.0);

        // Test modulus method
        int resultModulus = myImplementation.modulus(15, 4);
        System.out.println("Modulus Result: " + resultModulus);

        // Test modulus method with divisor as zero
        resultModulus = myImplementation.modulus(8, 0);
    }
}
