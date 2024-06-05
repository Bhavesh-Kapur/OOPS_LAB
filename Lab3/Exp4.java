import java.util.Scanner;

public class Exp4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number (1 - 12): ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);

        System.out.println("The month name is: " + monthName);

        scanner.close();
    }

    private static String getMonthName(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Invalid month number: " + monthNumber);
        }

        return monthNames[monthNumber - 1];
    }
}
