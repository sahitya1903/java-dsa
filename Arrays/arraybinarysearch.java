public class arraybinarysearch {
    public static int bs(int[] num, int key) {
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==num[mid]){
                return mid;
            }
            else if(key<num[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num ={1,4,9,11,17,22,30};
        int key=22;
        int a=bs(num, key);
        if (a==-1){
            System.err.println("Key not found");
        }
        else{
            System.out.println("Index of key is:"+a);
        }

    }
}
