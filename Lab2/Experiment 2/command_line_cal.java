import java.util.Scanner;
class command_line_cal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        boolean t= true;
        do{
            System.out.println();
            System.out.println("Welcome to calculator");
            System.out.println("Press 1 to add ");
            System.out.println("Press 2 to subtract ");
            System.out.println("Press 3 to multiply ");
            System.out.println("Press 4 to divide ");
            System.out.println("Press 5 to exit ");
            System.out.println("Please enter your choice ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Input 2 numbers to add them");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    add(a,b);  
                    break;
                case 2:
                    System.out.println("Input 2 numbers to subtract them");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    sub(a,b);  
                    break;
                case 3:
                    System.out.println("Input 2 numbers to multiply them");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    mul(a,b);  
                    break;
                case 4:
                    System.out.println("Input 2 numbers to divide them");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    div(a,b);  
                    break;
                case 5:
                    t=false;
                    System.out.println("Bye bye ");  
                    break;
                default: 
                    System.out.println("Wrong choice entered");
            }
        }while(t);
        
    }

    public static void add(int x, int y){
        System.out.println("Addtion of two numbers is: "+(x+y));
    }

     public static void sub(int x, int y){
        System.out.println("Subtraction of two numbers is: "+(x-y));
    }
     public static void mul(int x, int y){
        System.out.println("Multiplication of two numbers is: "+ (x*y));
    }
    public static void div(int x, int y){
        System.out.println("Division of two numbers is: "+ (x/y));
    }

    
}