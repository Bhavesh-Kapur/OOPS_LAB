//Write a program to implement the concept of threading by extending Thread
//Class and Runnable interface.


class MyT extends Thread {                 //thread class
    public void run() {
        System.out.println("Thread is running");
    }
}


class MyR implements Runnable {          //interface class
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class Expr1 {
    public static void main(String[] args) {     //object creation 
        MyT t = new MyT();
        t.start();
        
        MyR r = new MyR();
        Thread t2 = new Thread(r);
        t2.start();
    }
}