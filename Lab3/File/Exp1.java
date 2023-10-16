import java.util.Scanner;
class Exp1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter the no. of records you want to enter: ");    
        int records=sc.nextInt();               //input for the number of records
        int[]  arr = new int[records];          //array declared for the given records

        for(i=0;i<records;i++){
            System.out.print("Enter record marks for "+(i+1)+" student: ");
            arr[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println();

        System.out.println("----------------Chart-----------------");
        System.out.println("Student         Marks      Description");
        
        for(i=0;i<records;i++){
            if(arr[i]>=40 && arr[i]<=50){
                System.out.println("Student "+(i+1)+"        "+arr[i]+"           "+"PASS");
            }
            else if(arr[i]>=51 && arr[i]<=75){
                System.out.println("Student "+(i+1)+"        "+arr[i]+"           "+"MERIT");
            }
            else if (arr[i]>75 && arr[i]<=100){
                System.out.println("Student "+(i+1)+"        "+arr[i]+"         "+"DISTINCTION");
            }
        }
    }
}