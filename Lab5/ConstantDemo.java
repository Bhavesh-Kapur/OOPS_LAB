// Define an interface for constants
interface Constants {
    // Constants related to the program
    int MAX_VALUE = 100;
    int MIN_VALUE = 0;
    String PROGRAM_NAME = "ConstantDemo";
}
// A class that uses the constants from the interface
class Program {
    public void run() {
        System.out.println("Welcome to " + Constants.PROGRAM_NAME);
        System.out.println("Minimum Value: " + Constants.MIN_VALUE);
        System.out.println("Maximum Value: " + Constants.MAX_VALUE);
    }
}
public class ConstantDemo {
    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }
}
