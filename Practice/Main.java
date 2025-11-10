// import java.util.*;
// public class Main {
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int q=sc.nextInt();
//       for(int i=0;i<q;i++){
//          int n=sc.nextInt();
//          String s=sc.next();
//          String t=sc.next();

//       }
//       sc.close();
//    }
// }


// class NumberThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(i + " ");
//             try { Thread.sleep(300); } catch (InterruptedException e) {}
//         }
//     }
// }

// class AlphabetThread extends Thread {
//     public void run() {
//         for (char ch = 'A'; ch <= 'J'; ch++) {
//             System.out.print(ch + " ");
//             try { Thread.sleep(300); } catch (InterruptedException e) {}
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         NumberThread t1 = new NumberThread();
//         AlphabetThread t2 = new AlphabetThread();

//         t1.start();
//         t2.start();
//     }
// }


public class Main {
    public static void main(String[] args) {
        // for(int i=1;i<5;i++){
        //     System.out.print(" ".repeat(5-i));
        //     System.out.print("* ".repeat(i));
        //     System.out.println();
        // }
        int l=1;
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ".repeat(5-i));
                System.out.print(l++ +" " );
            }
            System.out.println();
        }
    }
}
