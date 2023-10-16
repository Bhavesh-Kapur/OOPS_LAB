//write a program to input data through command line and add them 
import java.util.Scanner;       //importing scanner class for user input and command line
class command_line
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Enter the two numbers for addition: ");
        a=sc.nextInt();
        b=sc.nextInt();                //input the two numbers
        System.out.println();
        int c = a+b;
        System.out.println("Addition is: "+c);    //showing the addition 
    }
}