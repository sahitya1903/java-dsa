import java.util.*;

public class prime {

    public static void primecheck1(int n) {
        int i = 1;
        int p = 0;
        while (i <= n) {
            if (n % i == 0) {
                p++;
            }
            i++;
        }
        if (p == 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Composite");
        }
    }

    public static void primecheck2(int n) {
        boolean isprime = true;
        if (n == 2) {
            System.out.println("Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == false) {
                System.out.println("Composite");
            } else {
                System.out.println("Prime");
            }
        }
    }

    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number(>1) to check if it is prime or composite:");
        int n = sc.nextInt();
        sc.close();
        primecheck1(n); // Brute Force
        primecheck2(n); // Optimised
        if (isprime(n)) { // Best optimised
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        System.out.println("Prime Numbers which are less than " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
