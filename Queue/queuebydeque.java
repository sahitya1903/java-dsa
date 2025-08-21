import java.util.Deque;
import java.util.LinkedList;

public class queuebydeque {
    static class Queue{
        static Deque<Integer> deque=new LinkedList<>();

        public boolean isEmpty() {
            return deque.size()==0;
        }
        
        public void add(int data) {
                deque.addLast(data);
        }

        public int remove() {
            int a=deque.removeFirst();
            return a;
        }

        public int peek(){
            int a=deque.getFirst();
            return a;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}
