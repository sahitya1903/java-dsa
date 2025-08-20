import java.util.Arrays;
import java.util.Collections;
public class sortfunc2 {
    public static void Print (Integer arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[]={1,2,7,5,4,3};
        Arrays.sort(arr,0,6,Collections.reverseOrder()); //ascending order
        Print(arr);

    }
}
