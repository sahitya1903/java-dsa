import java.util.*;
public class arraybasic {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks[]=new int[50];
        int numbers[]={1,2,4};
        String fruits[]={"apple","mango"};
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Physics:"+marks[0]);
        System.out.println("Chemistry:"+marks[1]);
        System.out.println("Maths:"+marks[2]);
        marks[2]=98;
        System.out.println("Maths:"+marks[2]);
        float percentage=(marks[0]+marks[1]+marks[2])/3f;
        System.out.println("Percentage:"+percentage);
        System.out.println("Length of array:"+marks.length);
        System.out.println(numbers[0]);
        System.out.println(fruits[1]);
        sc.close();
    }
}

