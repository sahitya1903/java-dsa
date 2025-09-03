import java.util.*;
public class arraylist {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Java Collection Framework

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        list.add(1);   //TC=O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
 
        list.add(1,9);      //TC=O(n)
        System.out.println(list);

        int element=list.get(2);    //TC=O(1)
        System.out.println(element);

        list.remove(2);     //TC=O(n)
        System.out.println(list);

        list.set(2,10);     //TC=O(n)
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println(list.size());

        //Printing arraylist
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //Printing reverse arraylist            TC=O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars) {
          System.out.println(i);
        }
    }
}
