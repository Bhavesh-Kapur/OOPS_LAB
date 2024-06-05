import java.lang.Math;
import java.util.*;   //using predefiend packages util and lang
class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    //use of util package 
        int a,b;
        System.out.println("Enter two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Product is :"+Math.pow(a,b));       //use of lang package
    }
}



