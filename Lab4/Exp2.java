//wap in java to create a player class inherit the class crivket player, football player and hockey player from the player class

class player{
    String name;
    int age;
    public player(String name, int age){      // parent class
        this.name=name;
        this.age=age;       //parent member variables
    }

   public void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);      //display function in the parent class
    }
}



class cricket_player extends player{
    public cricket_player(String name, int age){     //first player class extends parent class
        super(name,age);
    }
    
}



class football_player extends player{
    public football_player(String name, int age){     // //second player class extends parent class
        super(name,age);
    }
   
}


class hockey_player extends player{
    public hockey_player(String name, int age){     //third player class extends parent class
        super(name,age);
    }
}


class Exp2
{
    public static void main(String args[])     //main class
    {
        //player p=new player();
        cricket_player cp=new cricket_player("Akshit",19);    //first class object creation and passing of values
        cp.display();

        football_player fp=new football_player("Akshit",19);  //second class object creation and passing of values
        fp.display();

        hockey_player hp=new hockey_player("Akshit",19);       // third class object creation and passing the values
        hp.display();                                       // displaying thru each class obj and method used from the parent class
    }
}
