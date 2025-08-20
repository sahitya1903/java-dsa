public class power1 {
    public static int exp2(int x,int n) {
        if(n==0){
            return 1;
        }  
        int hp=exp2(x, n/2)*exp2(x, n/2);
        
        if(n%2!=0){
            hp=x*hp;
        }
        
        return hp; 
    }
    public static void main(String[] args) {
        System.out.println(exp2(2,10));
    }
}
