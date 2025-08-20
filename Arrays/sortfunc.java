import java.util.Arrays;
public class sortfunc {
    public static void Print (int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,7,5,4,3};
        Arrays.sort(arr,1,5); //ascending order
        Print(arr);
    }
}
