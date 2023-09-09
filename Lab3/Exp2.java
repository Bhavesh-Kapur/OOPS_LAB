//WAP to accept 3 digits and prints it all combinattions from (0-9)


import java.util.*;    //importing util pacakge for scanner class
class Exp2
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);          //making the object for scanner class
        int i,n,t;
        int[] arr=new int[3];
        System.out.print("Enter the a three digit number: ");   //user input of the three digit no.
        n=sc.nextInt();
        while(n!=0)
        {
            for(i=0;i<3;i++)
            {
                t=n%10;
                arr[i]=t;     //for and while to get every digit of the no. entered by the user
                n=n/10;
            }
        }

System.out.println("The combinations are: ");
        for(i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(arr[k]!=arr[i] && arr[k]!=arr[j] && arr[i]!=arr[j])    //finding out all possible outcomes
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);     //printing all combinations for the given input
                    }
                }
            }
        }
    }
}