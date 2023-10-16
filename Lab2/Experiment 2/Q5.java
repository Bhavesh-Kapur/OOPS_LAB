import java.util.Scanner;
  class Details{
    public String name;
    public int age;
    public Details(String name, int age){
        this.name=name;
        this.age=age;
    }

    public  void show(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
    }
}


public class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter the name and Age of the user");
        name=sc.nextLine();
        age=sc.nextInt();
        Details obj1 = new Details(name,age);
        obj1.show();

    }
}