import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //Insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //Get
        int population=hm.get("India");
        System.out.println(population);

        //ContainsKey
        System.out.println(hm.containsKey("Indonesia"));

        //Remove
        System.out.println(hm.remove("US"));

        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);



        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println("Key= "+k+", Value= "+hm.get(k));
        }

    }    
}
