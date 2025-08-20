public class subarrays {
    public static void sub(int arr[]) {
        int subarray=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+subarray);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        sub(arr);
    }
}
