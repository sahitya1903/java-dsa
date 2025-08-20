public class lastoccur {
    public static int locc(int arr[],int key,int i) {
        if(i==arr.length-1){
            return -1; 
        }
        int isfound=locc(arr, key, i+1);
        if (isfound==-1 && arr[i]==key){
            return i;
        } 
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,3,1,0};
        System.out.println(locc(arr, 3, 0));
        
    }
}

 