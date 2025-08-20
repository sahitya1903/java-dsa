public class reverse {
    public static void reverse1() {
    int a=123456;
    int rev=0;
    while (a>0){
        int b=a%10;
        rev=rev*10+b;
        a/=10;
    }
    System.out.println(rev);
    }

    public static void reverse2() {
        int a=123456;
        while (a>0){
            int b=a%10;
            System.out.print(b);
            a/=10;
        }
    }
    public static void main(String[] args) {
        reverse1();
        reverse2();
    }
}

