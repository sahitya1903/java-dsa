public class fibonacci {
    public static int fibo(int n) {
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else if (n>2){
            return fibo(n-1)+fibo(n-2);
        }
        else{
            System.out.println("Invalid no. of Terms");
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(25));
        for(int i=1;i<=25;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
