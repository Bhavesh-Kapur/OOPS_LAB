import java.util.*;

class Complex {
    double real, imaginary;

    Complex(double r, double i) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Multiply two complex numbers
    Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }
}

public class test {
    static Complex complexPower(Complex base, int exponent) {
        Complex result = new Complex(1, 0);

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Complex i = new Complex(0, 1);

        // Set the value of n
        int n = 8;

        // Calculate (1 + i)^n
        Complex result = complexPower(new Complex(1, 1), n);

        // Print the result
        System.out.println("Result: " + result.real + " + " + result.imaginary + "i");
    }
}