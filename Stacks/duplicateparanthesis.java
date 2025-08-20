//String is always valid, so never empty
import java.util.*;
public class duplicateparanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch==')') {
                int count=0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;        //duplicate
                } else{
                    s.pop();            //opening paranthesis pop
                }
            } else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="(((a+b)-(c+d)))";      //true
        String str2="(a-b)";        //false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
