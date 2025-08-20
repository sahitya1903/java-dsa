import java.util.Deque;
import java.util.LinkedList;

public class stackbydeque {

    static class Stack{
    static Deque<Integer> deque=new LinkedList<>();

    public boolean isEmpty() {
        return deque.size()==0;
    }
    
    public void push(int data) {
            deque.addLast(data);
    }

    public int pop() {
        int a=deque.removeLast();
        return a;
    }

    public int peek(){
        int a=deque.getLast();
        return a;
    }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
