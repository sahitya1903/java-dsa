public class oops5 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum((float)1.2,(float)2.5));
        Deer d=new Deer();
        d.eat();
    }
}

//Method Overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}


//Method Overriding
class animal{       //Base Class
    void eat(){
        System.out.println("eats");
    }
}

class Deer extends animal{      //Derived Class 1
    void eat(){
        System.out.println("eats grass");
    }
}