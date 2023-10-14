//Write a program in java to find largest of 3 numbers
class largest
{
    public static void main(String args[])
    {
 
        int a=4,b=2,c=4;    //three variables
        if(a>b && a>c) 
         System.out.println("The largest no. is: "+a);
        else if(b>a && b>c) //condition if b is the largest
         System.out.println("The largest no. is: "+b);
        else        //condition if c is the largest
         System.out.println("The largest no. is: "+c);
    }
}