public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        // Integer a=10;     
        // String b=a.toString();   //This function coverts to string
        // System.out.println(b);
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);                      //Time complexity is O(26)
        // if string is used here, timecomplexity will be O(26*26)
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}