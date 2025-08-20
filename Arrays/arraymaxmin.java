public class arraymaxmin {
    public static void maxmin(int arr[]) {
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>Max){
                Max=arr[i];
            }
            if (arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println("Maximum Number:"+Max);
        System.out.println("Minimum Number:"+Min);
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,10,4,8,11,4,3,2};
        maxmin(arr);
    }
}
