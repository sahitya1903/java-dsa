import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = x + y;
        if (res % 12 != 0) {
            System.out.println(res % 12);
        } else {
            System.out.println(12);
        }
        sc.close();
    }
}