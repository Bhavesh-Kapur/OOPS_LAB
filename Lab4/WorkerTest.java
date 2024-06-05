import java.util.Scanner;
class Worker {
    private String name;
    private double salaryRate;
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours) {
        return hours * salaryRate;
    }
    public String getName() {
        return name;
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int daysWorked) {
        // Use the salaryRate from the superclass (Worker)
        return daysWorked * super.computePay(1);
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int hours) {
        // Salaried workers get paid for 40 hours a week
        return super.computePay(40);
    }
}
public class WorkerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input for DailyWorker
        System.out.print("Enter the name of the daily worker: ");
        String dailyWorkerName = scanner.nextLine();
        System.out.print("Enter the daily worker's hourly rate: ");
        double dailyWorkerRate = scanner.nextDouble();
        System.out.print("Enter the number of days worked by the daily worker: ");
        int daysWorked = scanner.nextInt();
        // Get user input for SalariedWorker
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter the name of the salaried worker: ");
        String salariedWorkerName = scanner.nextLine();
        System.out.print("Enter the salaried worker's weekly salary: ");
        double salariedWorkerRate = scanner.nextDouble();
        System.out.print("Enter the number of hours worked by the salaried worker: ");
        int hoursWorked = scanner.nextInt();
        scanner.close(); // Close the scanner
        // Create instances of workers
        DailyWorker dailyWorker = new DailyWorker(dailyWorkerName, dailyWorkerRate);
        SalariedWorker salariedWorker = new SalariedWorker(salariedWorkerName, salariedWorkerRate);
        // Calculate and display pay
        double dailyWorkerPay = dailyWorker.computePay(daysWorked);
        double salariedWorkerPay = salariedWorker.computePay(hoursWorked);
        System.out.println("Daily Worker Pay: " + dailyWorkerPay);
        System.out.println("Salaried Worker Pay: " + salariedWorkerPay);
    }
}
