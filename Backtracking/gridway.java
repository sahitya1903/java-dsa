//Unoptimised Time Complexity
public class gridway {
    public static int gridways(int i,int j, int r, int c) {
        if(i==r-1 && j==r-1){
            return 1;
        }
        else if(i==r||j==c){
            return 0;
        }
        int w1=gridways(i+1, j, r, c);
        int w2=gridways(i, j+1, r, c);
        return w1+w2;
    }
    public static void main(String[] args) {
        int r=3,c=3;
        System.out.println("Total ways:"+gridways(0,0,r,c));
    } 
    
}
