import java.util.ArrayList;
import java.util.Arrays;

 //Array is sorted and rotated about a pivot

 //Brute Force Approach same as pairsum1 
public class pairsum2 {
    //2 Pointer Approach            TC=O(n)
    public static boolean pointer (ArrayList<Integer> list,int target) {
         int bp=-1;
         for(int i=0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)) {
                bp=i;
                break;
            }
         }
         int lp=bp+1;       //smallest
         int rp=bp;         //largest

         while (lp!=bp) {
            if (list.get(lp)+list.get(rp)==target) {
                System.out.println("("+list.get(lp)+","+list.get(rp)+")");
                return true;
            }
            else if (list.get(lp)+list.get(rp)<target) {
                lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }
         }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        int target=16;
        System.out.println(pointer(list, target));
    }
}
