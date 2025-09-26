package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {

    public static void max(ArrayList<Integer> l) {
        int max = Integer.MIN_VALUE;
        // Finding max TC=(n)
        for (int i = 0; i < l.size(); i++) {
            // if (l.get(i)>max) {
            // max=l.get(i);
            // }
            max = Math.max(max, l.get(i));
        }
        System.out.println("Maximum element in list:" + max);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Swap two numbers at given index
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); // TC=O(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        max(list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);

        Collections.sort(list); // Sorting

        Collections.sort(list, Collections.reverseOrder()); // Descending order Sorting
    }
}
