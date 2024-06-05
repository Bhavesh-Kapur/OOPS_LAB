import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Initialize arrays for names and roll numbers
        String[] studentNames = new String[10];
        int[] rollNumbers = new int[10];

        // Populate arrays with user input
        userInput(new Scanner(System.in), studentNames, rollNumbers);

        // Display students' names and roll numbers
        try {
            displayStudentInfo(studentNames, rollNumbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Check your array sizes.");
        }
    }

    // Method to take user input for student names and roll numbers
    private static void userInput(Scanner scanner, String[] names, int[] rollNumbers) {
        System.out.println("Enter information for 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }
    }

    // Method to display students' names and roll numbers
    private static void displayStudentInfo(String[] names, int[] rollNumbers) {
        System.out.println("Students' Information:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Roll Number: " + rollNumbers[i] + ", Name: " + names[i]);
        }
    }
}
