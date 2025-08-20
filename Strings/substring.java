public class substring {
    public static String substr (String str, int si, int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Hello World"; 
        String a=substr(str, 0, 4);
        System.out.println(a);
        System.out.println(str.substring(0,5)); //inbuilt function
    }
    
}
 