public class oops2{
    public static void main(String[] args) {
        Pen2 p1=new Pen2(); //object p1
        p1.Setcolor("Blue");
        p1.settip(5);
        System.out.println(p1.getcolor());
        System.out.println(p1.getTip());
        p1.Setcolor("Red");
        System.out.println(p1.getcolor());


    }
}

class Pen2{
    private String color;
    private int tip;
  
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void Setcolor(String newcolor){
        this.color=newcolor;
    }

    void settip(int tip){
        this.tip=tip;
    }
}
