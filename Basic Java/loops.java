import java.util.Scanner;
public class loops{

    public static void numbers(Scanner sc){
        int c=0;
        System.out.print("Enter Number:");
        int s=sc.nextInt();
        while (c<=s){
            System.out.println(c);
            c++;
        }
    }

    public static void printnum(Scanner sc){
        int c=0;
        while(c<5){
            System.out.print("Enter number:");
            int n=sc.nextInt();
            if (n%10==0){
                continue;
            }
            else if (n%5==0){
                System.out.println(n);
            }
            else{
                break;
            }
            c++;
        }
        System.out.println("out of loop");
    }

    public static void consecutivesum(Scanner sc){
        int sum=0;
        int c=1;
        System.out.print("Enter number:");
        int n=sc.nextInt();
        while (c<=n){
            sum=sum+c;
            c++;
        }
        System.out.print("Sum of "+n+" consecutive numbers is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        numbers(sc);
        printnum(sc);
        consecutivesum(sc);
        sc.close();
    }
}
