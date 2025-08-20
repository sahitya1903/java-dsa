public class palindrome {
    public static boolean ispalindrome(String str) {
        int n=str.length();
        for(int i=0;i<n;i++){
            if (str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str="racecar";
        boolean a=ispalindrome(str);
        System.out.println(a);
    }
}
