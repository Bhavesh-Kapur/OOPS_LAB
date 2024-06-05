import java.util.*;
import java.lang.Math;
interface test{
    int sq(int n);     //defination of the interface 
}   
class Arithmetic implements test{      //implementing the interface
    public int sq(int n){              //overriding the method 
        return ((int)(Math.pow(n,2)));      //returning the square of the number passed into the method
    }
}
class ToTestInt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");    // user input the number which is to get passed into the method 
        int n=sc.nextInt();
        Arithmetic obj = new Arithmetic();         //clas arithmetic object created 
        int result = obj.sq(n);                    //storing the output in the variable named result
        System.out.println("Output is: "+ result);
    }
}

