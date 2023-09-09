//WAP to get the sum of all integers 40> and <250 that are divisible by 5

class Exp3
{
    public static void main(String args[])   //main class
    {
        int sum=0;
        for(int i=40;i<=250;i++)
         {
            if(i%5==0)     //condition statement for checking if the no. is divisible by 5 or not
            {
                sum=sum+i;    //adding it to sum if the no. is divisble by 5
            }
         }

         System.out.println("Sum of no. which are divisible by 5 is: "+sum);    //printing the sum 
    }
}