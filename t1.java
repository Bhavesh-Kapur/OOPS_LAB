public class t1 extends Thread{
    public static int amt=0;
    public static void main(String[] args) {
        t1 obj = new t1();
        obj.start();
        System.out.println(amt+"this is 1");
        amt++;
        System.out.println(amt);
        System.out.println(amt+"Lst");
    }
    public void run(){
        amt++;
    }
}
