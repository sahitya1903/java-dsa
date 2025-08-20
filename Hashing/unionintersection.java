import java.util.HashSet;

public class unionintersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> union=new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        System.out.println("Union:"+union);
        System.out.println("No. of Union elements:"+union.size());

        //Intersection
        HashSet<Integer> intersection=new HashSet<>();
        HashSet<Integer> temp=new HashSet<>();      

        for(int i=0;i<arr1.length;i++){
            temp.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if (temp.contains(arr2[i])){
                intersection.add(arr2[i]);
                temp.remove(arr2[i]);
            }
        }
        System.out.println("Intersection:"+intersection);
        System.out.println("No. of Intersection elements:"+intersection.size());
    }
}
