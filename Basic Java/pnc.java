import java.util.*;
public class pnc {
        public static int fact(int a) {
        int p=1;
        for (int i=1;i<=a;i++){
            p=p*i;
        }
        return p;
    }
    public static int bino(int n,int r) {
        int b=fact(n)/(fact(r)*fact(n-r));
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter total objects: ");
        int n=sc.nextInt();
        System.out.print("Enter selection objects: ");
        int r=sc.nextInt();
        int bino=bino(n,r);
        System.out.println("No. of total ways for selecting "+r+" objects out of "+n+" objects: "+ bino);

        System.out.print("Enter number to find factorial: ");
        int a=sc.nextInt();
        System.out.println("Factorial:"+fact(a));
        sc.close();
    }
}
