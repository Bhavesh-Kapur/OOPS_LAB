import Balance.Account;    //package Balance 
import java.util.*;        //used for user input 
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();       //Account class object creation 
        System.out.println("Deposit is :");
        int dep;
        dep=sc.nextInt();
        account.Deposit(dep);          //deposit balance 
        account.Display_Balance();           
        System.out.println("Do you want to windraww Press 1 to withdraw");
        int c;
        c=sc.nextInt();
        if(c==1){
            System.out.println("Enter amt to withdraw :");
            int w;
            w=sc.nextInt();
            account.Withdraw(w);  // Withdraw or update balance 
            account.Display_Balance();        //method display Balance 
        }
        else{
            System.out.println("Bye Bye");
        }
    }
}