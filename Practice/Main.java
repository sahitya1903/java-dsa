package Practice;

import java.util.HashMap;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Ocelot",1);
//        map.put("Serval",2);
//        map.put("Lynx",3);
//
//        String x= sc.next();
//        String y= sc.next();
//        if(map.containsKey(x) && map.containsKey(y)) {
//            if (map.get(x) >= map.get(y)) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }else  {
//            System.out.println("Invalid input");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (!map.containsKey(ch)) {
//                map.put(ch, 1);
//            }else {
//                map.put(ch, map.get(ch) + 1);
//            }
//        }
//        for(char k: map.keySet()){
//            if(map.get(k)==1){System.out.println(k);}
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, i);
        }
        for(int i = 1; i <= q; i++) {
            int c=0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = 1; j <= n; j++) {
                if (map.get(j) <= x) {
                    map.put(j, y);
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}