import java.util.Vector;

public class practice3 {
    public static void main(String[] args) {
        int arr[]={2,5,6,7,8,8,9};
        int target=5;
        int count=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            int diff=Math.abs(arr[i]-target);
            if(diff<count){
                count=arr[i];
            }
        }
        System.out.println(count);
        Vector <Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
        v.add(2,30);
        System.out.println(v);
        
    }
}
