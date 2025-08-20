public class expo {
    public static boolean ispower2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int fastexp(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static int modularexp(int x, int y, int p) {
        int res = 1;
        x = x % p;
        if (x == 0) {
            return 0;
        }
        while (y > 0) {
            if ((y & 1) != 0) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ispower2(8));
        System.out.println(fastexp(3, 5));
        System.out.print("Power is " + modularexp(2, 5, 13));
    }
}
