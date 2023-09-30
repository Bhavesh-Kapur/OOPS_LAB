interface A{     //interface defination
    void meth1();       //void method 1 and method 2
    void meth2();
}

class Myclass implements A{            //implementing interface A into Myclass
    public void meth1(){
        System.out.println("Meth 1 overide");     //showcasing method 1 overide the interface method
    }

    public void meth2(){
        System.out.println("Meth2 overide");      //showcasing method 2 overide the interface method
    }
}


class Imple{                                            //main class
    public static void main(String args[]){
        Myclass obj = new Myclass();                    //object creation of myclass
        obj.meth1();                                    //methods calling
        obj.meth2();
        System.out.println("This is main Body");
    }
}