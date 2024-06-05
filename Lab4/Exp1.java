//wap to show that private member of a super class cant be derived from class
 
class parent{
    private int pm;   //initialization of the private member
    public parent()
    {
        pm=10;        //declared the private member as 10
    }

    public void display(){
        System.out.println("Private member is :"+ pm);
    }
}

class child extends parent{
    public child(){
        //pm=25;   // the private member cant be updated in the derived class
    }
}
class Exp1{
    public static void main(String args[]){
        parent p=new parent();
       // p.pm=20;  //private members cant be updated
        p.display();

        child c=new child();
        c.display();    //private member can be printed using the child class as well
    }

}