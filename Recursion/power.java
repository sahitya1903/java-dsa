public class power {
    public static int exp (int x, int n) {
        if(n==0){
            return 1;
        }
        else{
            return x*(exp(x, n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(exp(2,5));
    }
}
