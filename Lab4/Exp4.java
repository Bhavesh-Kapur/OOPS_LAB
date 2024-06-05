import java.util.*;
class Employee 
{
    int empid;
    double salary;
    String name;      //parent class members
    public Employee() {
        // Default constructor
    }
    public Employee(String name,int empid, double salary)  //constructor
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {     //to get respective members
        return salary;
    }
    public int getempid()
    {
        return empid;
    }
    public void display(){
        System.out.println("Name of employee: "+ name);
        System.out.println("empid of employee: "+ empid);     //display members all at a time 
        System.out.println("Salary of employee: "+ salary);
    }
    public void increaseSalary(double per){     //method to increase the salary 
double increaseAmount = salary * (per / 100);
        salary=salary+ increaseAmount;          //salary getting updated
    }
}
class Manager extends Employee {    //class manager 
    String department;
    public Manager(String name, int empId, double salary, String department) {   
        super(name, empId, salary);
        this.department = department;        // assignning department 
    }
    public String getDepartment() {
        return department;
    }
}
class Exp4
{
    public static void main(String args[])    //main class
    { 
        Scanner sc=new Scanner(System.in);      //using util scanner for user input
        double p;    
        System.out.println("Enter the percentage increase in the salary");
        p=sc.nextDouble();
        Employee employee = new Employee("Emp1", 12345, 50000);     //object creation of employee class
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        employee.increaseSalary(p);
        System.out.println("Increased Salary: " + employee.getSalary());
        System.out.println();
        Manager manager = new Manager("Bhavesh", 54321, 80000, "Manager");    //object creation of the derived class manager
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());   //acessing the data members one by one 
        manager.increaseSalary(p);
        System.out.println("Increased Salary: " + manager.getSalary());        //increase of the salary 
    }
}