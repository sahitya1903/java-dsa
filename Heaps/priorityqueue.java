import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(3);  //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");      //O(1)
            pq.remove();        //O(log n)
        }
        System.out.println();


        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(3);  //O(log n)
        pq2.add(4);
        pq2.add(1);
        pq2.add(7);

        while (!pq2.isEmpty()) {
            System.out.print(pq2.peek()+" ");      //O(1)
            pq2.remove();        //O(log n)
        }
        System.out.println();
    }
}
