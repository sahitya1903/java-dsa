public class equal {
    public static void compare(String str1,String str2) {
        if (str1.equals(str2)){
            System.out.println("Equal Strings");
        }
        else{
            System.out.println("Not equal Strings");
        }
    }
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");
        if (s1==s3){        //compares at memory allocation level
            System.out.println("Equal Strings");
        }
        else{
            System.out.println("Not equal Strings");
        }
        compare(s2, s3); // compares actual value
        if (s1.contains("To")) {
            System.out.println("H");
        }
    }
    
}