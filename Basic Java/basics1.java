import java.util.*;

public class basics1 {

    public static void calculator(Scanner sc) {
        System.out.println("****Welcome to your Basic Calculator****");
        System.out.print("Enter first number:");
        float a = sc.nextFloat();
        System.out.print("Select operation to be performed:");
        char c = sc.next().charAt(0);
        System.out.print("Enter second number:");
        float b = sc.nextFloat();
        switch (c) {
            case '+':
                System.out.println("Sum is:" + (a + b));
                break;
            case '-':
                System.out.println("Difference is:" + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is:" + (a * b));
                break;
            case '/':
                System.out.println("Quotient is:" + (a / b));
                break;
            case '%':
                System.out.println("Remainder is:" + (a % b));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

    public static void average(Scanner sc) {
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.print("Enter third number:");
        int c = sc.nextInt();
        float avg = (a + b + c) / 3f;
        System.out.println("Given numbers are: " + a + ", " + b + " ," + c);
        System.out.print("Average of above numbers is: " + avg);
    }

    public static void gstcalculator(Scanner sc) {
        System.out.print("Enter cost of pencil:");
        int a = sc.nextInt();
        System.out.print("Enter cost of pen:");
        int b = sc.nextInt();
        System.out.print("Enter cost of eraser:");
        int c = sc.nextInt();
        int cost = a + b + c;
        float gst = cost * 0.18f;
        float tot = cost + gst;
        System.out.println("Cost:" + cost);
        System.out.println("GST:" + gst);
        System.out.println("Total cost: " + tot);
    }

    public static void squarearea(Scanner sc) {
        System.out.print("Enter side length in cm: ");
        float a = sc.nextFloat();
        float area = a * a;
        System.out.print("Area of square is: " + area + " square cm");
    }

    public static void circlearea(Scanner sc) {
        System.out.println("Enter radius:");
        float rad = sc.nextFloat();
        float area = 22 / 7f * rad * rad;
        System.out.print(area);
    }

    public static void oddevencheck(Scanner sc) {
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        sc.close();
        if (a % 2 == 0) {
            System.out.print(a + " is even.");
        } else {
            System.out.print(a + " is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator(sc);
        average(sc);
        gstcalculator(sc);
        squarearea(sc);
        circlearea(sc);
        oddevencheck(sc);
        sc.close();
    }
}
