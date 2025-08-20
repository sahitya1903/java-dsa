import java.util.Stack;

public class nextgreater {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[arr.length];

        for (int i=arr.length-1;i>=0;i--) {
            //while
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            //if-else
            if (s.isEmpty()) {
                nextGreater[i]=-1;
            }  else{
                nextGreater[i]=arr[s.peek()];
            }
            //push in s
            s.push(i);
        }

        for (int n: nextGreater) {
            System.out.println(n);
        }
    }
}

//Next Greater Right--done
//Next Smaller Right--for loop change
//Next Greater Left--while loop change
//Next Smaller Left--both for and while loop change