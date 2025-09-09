public class OOPS {

    static class Pen {
        String color;
        int tip;

        void Setcolor(String newcolor) {
            color = newcolor;
        }

        void settip(int newtip) {
            tip = newtip;
        }
    }

    @SuppressWarnings("unused")
    static class BankAccount {
        public String username;
        private String password;

        public void setpassword(String pwd) {
            password = pwd;
        }
    }

    public static void main(String[] args) {
        Pen p1 = new Pen(); //object p1
        p1.Setcolor("Blue");
        p1.settip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.Setcolor("Red");
        System.out.println(p1.color);
        p1.color = "Black";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "sahitya";
        myAcc.setpassword("1234");

    }
}