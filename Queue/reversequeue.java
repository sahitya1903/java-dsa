import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s=new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<6;i++){
            q.add(i);
        }
        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
