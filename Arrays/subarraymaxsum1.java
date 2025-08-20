// Brute Force
public class subarraymaxsum1 {
    public static int maxsubsum(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print("Subarray sum: "+sum);
                if (sum>maxsum){
                    maxsum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,5,2,-6,10,20};
        int a=maxsubsum(arr);
        System.out.println("Maximum sum of subarray:"+a);
    }
}
