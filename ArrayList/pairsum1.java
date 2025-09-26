package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//Arraylist should be sorted for 2 Pointer Approach..

public class pairsum1 {

    //Brute Force
    public static void sum1 (ArrayList<Integer> list, int target) {
        for (int i=0; i<list.size(); i++) {
            for (int j=i+1;j<list.size();j++){
                if (list.get(i)+list.get(j)==target) {
                    System.out.println("("+list.get(i)+","+list.get(j)+")");
                }
            }
        }
    }

    //2 Pointer Approach
    public static boolean sum2(ArrayList<Integer> list,int target) {
        Collections.sort(list);
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==target) {
                System.out.println("("+list.get(lp)+","+list.get(rp)+")");
                return true;
            }
            else if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i-1,i);
        }
        int target=5;
        sum1(list, target);
        sum2(list, target);
    }
}
