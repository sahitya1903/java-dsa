import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
public class functions {

    public static void Hello() {
        System.out.println("Hello");
    }


    public static int Sum(int num1, int num2) {     //parameter/formal parameter
        int sum= num1+num2;
        return sum;
    }

    public static String findDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek(); 
        return dayOfWeek.toString();
    }

    public static void swap(int a, int b) {     //parameter/formal parameter
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void leapyear(int y){
        if(((y%4==0) && (y%100!=0)) || (y%400==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        Hello();
        swap(a, b);
        int sum = Sum(a,b);                         //argument/actual parameter
        System.out.print("Sum of two numbers: "+sum);
        sc.close();

        leapyear(2025);
        System.out.println(findDay(11,19,2003));
    }
}
