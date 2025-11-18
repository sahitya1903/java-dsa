import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = a / b; // ArithmeticException
            System.out.println(c);
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } finally {
            System.out.println("Cleanup code executed (finally block).");
            sc.close();
        }
    }
}
