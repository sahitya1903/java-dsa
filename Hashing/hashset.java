import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(0);
        set.add(2);

        System.out.println(set);

        set.remove(2);
        if (set.contains(2)) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());


        HashSet<String> cities=new HashSet<>();

        cities.add("A");
        cities.add("B");
        cities.add("C");
        cities.add("D");
        cities.add("E");

        Iterator it=cities.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println();


        for (String city : cities) {
            System.out.print(city+" ");
        }
    }
}
