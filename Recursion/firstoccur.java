public class firstoccur {
    public static int focc(int arr[],int key,int i) {
        if(i==arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        } 
        return focc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,3,1,0};
        System.out.println(focc(arr, 1, 0));

    }
}

//Time Complexity O(n)
//Space Complexity O(n)
