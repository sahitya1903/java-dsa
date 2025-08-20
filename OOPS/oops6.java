@SuppressWarnings("unused")
public class oops6 {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changecolor();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        c.changecolor();
        System.out.println(c.color);
        Mustang m=new Mustang();
    }
}

abstract class animal2{
    String color;
    animal2(){
        System.out.println("animal2 Constructor called");
        color="brown";
    }

    void eat(){
        System.out.println("animal2 eats");
    }
    abstract void walk();
}
 
class Horse extends animal2{
    
    Horse(){
        super.color="red"; 
    System.out.println("Horse Constructor called");
    }

    void changecolor(){
        color="dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        super();
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends animal2{
    
    Chicken(){
    System.out.println("Chicken Constructor called");
    }

    void changecolor(){
        color="white";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}