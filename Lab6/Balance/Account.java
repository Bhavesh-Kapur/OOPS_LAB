package Balance;    //package name Balance 


public class Account {   //class account
    private int balance = 0;

    public void Display_Balance() {
        System.out.println("Current Balance: " + balance);     //display message method
    } 

    public void Deposit(int amount) {         //deposits method
        balance += amount;
    }

    public void Withdraw(int amount) {
        balance -= amount;    // method for withdraw 
    }
}