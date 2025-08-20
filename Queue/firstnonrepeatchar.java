import java.util.*;
import java.util.LinkedList;
public class firstnonrepeatchar {
    public static void printNonRepeating(String str) {
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        firstnonrepeatchar f=new firstnonrepeatchar();
        String str="aabccxb";
        f.printNonRepeating(str);
    }
}


//Alternative Approach
class Solution {
    public int firstUniqChar(String s) {
      int[] freq = new int[26];
      char[] chars = s.toCharArray();
      for(char c:chars) {
        freq[c-'a']++;
      }

      for(int i=0;i<chars.length;i++) {
         if(freq[chars[i] - 'a'] == 1) return i;
      }
      return -1;
    }
}