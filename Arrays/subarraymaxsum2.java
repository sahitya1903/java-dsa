// Prefix Method
public class subarraymaxsum2 {
    public static int maxsubsum(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        int currsum=0;
        prefix[0]=arr[0];
        for (int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if (currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,5,2,-6,10,20};
        int a=maxsubsum(arr);
        System.out.println("Maximum sum of subarray:"+a);
    }
}
