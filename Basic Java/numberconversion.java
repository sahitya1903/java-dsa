import java.util.*;
public class numberconversion {
    public static int bintodec(int m){
        int dec=0;
        int i=0;
        while (m>0){
        int p=m%10;
        dec=dec+(p*(int)Math.pow(2,i));
        i++;
        m/=10;
        }
        return dec;
    } 

    public static int dectobin(int n){
        int bin=0;
        int i=0;
        while ( n>0){
        int p=n%2;
        bin=bin+p*(int)Math.pow(10,i);
        i++;
        n=n/2;
        }
        return bin;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter binary number:");
        int n=sc.nextInt();
        int dec=bintodec(n);
        System.out.println("Decimal Value: "+dec);

        System.out.print("Enter decimal number:");
        int m=sc.nextInt();
        int bin=dectobin(m);
        System.out.println("Binary Value: "+bin);
        
        sc.close();
    }
}


