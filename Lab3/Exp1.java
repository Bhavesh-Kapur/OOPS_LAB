//WAP to accept 10. nos in an array wnad compute the sqaure of each no. and find the sum of the reuslt.


import java.util.*;       //importing util package for scanner class
import java.lang.Math;    //importing lang package for math classes
class Exp1
{
    public static void main(String args[])   //main class
    {
         Scanner sc=new Scanner(System.in);   //defining the scanner class
         int i;
         int[] arr =new int[10];
         for(i=0;i<10;i++)
         {
            System.out.print("Enter the "+(i+1)+" element: ");    
            arr[i]=sc.nextInt();                                   //user input of array element 
            System.out.println(); 

         }
        double sum=0;                       //initializing sum as double as it will be storing math.pow values
         for(i=0;i<10;i++)
         {
            sum=sum+Math.pow(arr[i],2);    //adding all the squares of the array 
         }

         System.out.println("Sum is: "+ sum);   //printing the sum which was calculated above.
    }
}