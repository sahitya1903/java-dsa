public class tiling {
    public static int tile(int n) {
        if(n==0 | n==1){
            return 1;
        }    //2xn total area of tile
        int f1=tile(n-1);
        int f2=tile(n-2);
        int ways=f1+f2;
        return ways;
    }
    public static void main(String[] args) {
           System.out.println(tile(5));
    }
    
} 
