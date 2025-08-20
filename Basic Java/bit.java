public class bit {
    public static int geti(int n,int i) {
        int bitmask=1&i;
        if ((n & bitmask)==0){
            return 0;
        } 
        else{
            return 1;
        }
    }

    public static int seti(int n,int i) {
        int bitmask=1<<i;
        return n|bitmask;
    } 

    public static int cleari(int n,int i) {
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    public static int updatei(int n,int i, int newbit) {
    //     if (newbit==0){
    //         return cleari(n, i);
    //     } 
    //     else{
    //         return seti(n, i);
    //     }
    n=cleari(n, i);
    int bitmask=newbit<<i;
    return n| bitmask;
    }

    public static int clearlasti(int n,int i) {
        int bitmask=(~0)<<i;
        return n & bitmask;
    }

    public static int clearibits(int n,int i,int j) {
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b; 
        return n & bitmask;
    }
    public static int countsetbits(int n) {
        int count=0;
        while(n>0){
            if ((n&1)!=0){
                count++;
            }
            n=n>>1;
        } 
        return count;
    }

    public static void main(String[] args) {
        System.out.println(geti(10,2));
        System.out.println(seti(10, 2));
        System.out.println(cleari(10, 2));
        System.out.println(updatei(10, 2, 1));
        System.out.println(clearlasti(10, 2));
        System.out.println(countsetbits(10));
    }
} 