@SuppressWarnings("unused")
public class oops4 {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        Animal a=new Bird();
        // a.fly();  //Error
    }
}

class Animal{       //Base Class
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    
    void breathe(){
        System.out.println("breathes");
    }       
}

class Bird extends Animal{      //Derived Class 1
    void fly(){
        System.out.println("Fly");
    }
}

class Fish extends Animal{         //Derived Class 2
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal{        //Derived Class 3
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammal{           //Derived Class 3(1)
    String breed;
}
