public class constructorchaining {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        House myHouse = new House();
        Child myChild = new Child();
    } 
}
class House {
    // Constructor 1 (Default)
    House() {
        this(3); // Calls Constructor 2
        System.out.println("A basic house is built.");
    }

    // Constructor 2 (Parameterized)
    House(int rooms) {
        System.out.println("House with " + rooms + " rooms is built.");
    }
    
}

class Parent {
    Parent() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent constructor
        System.out.println("This is the Child class.");
    }

}
