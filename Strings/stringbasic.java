import java.util.*;
public class stringbasic {
    public static void printletter(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        String str3=new String(arr);

        Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.next();  //single word
        // System.out.println(name);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        String name2=sc.nextLine();
        System.out.println(name2); 

        String firstname="Sahitya";
        String lastname="Kushwaha";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        printletter(fullname);
        sc.close();

    }
}
