//Write a program for generating 2 threads one for printing even numbers
// and the other for printing odd numbers


class EvenThread extends Thread {
    public void run() {                                      //even thread 
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {                   
            System.out.println("Odd Thread: " + i);                // odd thread
        }
    }
}

public class Exp2 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();                //object creation of even thread 
        OddThread oddThread = new OddThread();                   // object creation of odd thread 

        evenThread.start();
        oddThread.start();
    }
}