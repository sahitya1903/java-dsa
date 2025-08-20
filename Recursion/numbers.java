public class numbers {
    public static void dec (int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }

    public static void inc (int n) {
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

    public static int sum (int n) {
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        dec(10);
        inc(10);
        System.out.println(sum(10));
    }
    
}
