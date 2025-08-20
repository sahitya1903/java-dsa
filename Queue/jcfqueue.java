import java.util.ArrayDeque;
import java.util.Queue;

public class jcfqueue {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
            
        //Queue is an interface, so object of q is not possible
        //We can make object of Linked List or ArrayDeque, by which we need to implement it
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
