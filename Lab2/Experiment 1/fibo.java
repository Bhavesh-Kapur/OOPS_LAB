//write a program to get the fibo numbers using loop
import java.util.Scanner;
class fibo
{
    public static void fibofun(int s){    //void fibo fun as it is not returning any variable
        int n1=0,n2=1,n3=0,i;
        for(i=1;i<=s;i++)   // loop to get 10 fibo elements
        {
            n3=n1+n2;
            System.out.print(n1); // printing of the fibonacci series
            System.out.print(" ");
            n1=n2;
            n2=n3;
           
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int c=sc.nextInt();
        System.out.println();
        fibofun(c);    //function call of fibofun which will display the fibonacci series
    }
}