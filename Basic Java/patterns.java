public class patterns {
     public static void pattern1() {
        for(int i=1; i<=4;i++){
            for (int j=1;j<=4-i+1;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for(int i=1; i<=4;i++){
            for (int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for(int i=1; i<=4;i++){
            for (int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println();
        }
    }

        public static void pattern4() {
        char ch='A';
        for(int i=1; i<=4;i++){
           for (int j=1;j<=i;j++){
           System.out.print(ch);
           ch++; 
           }
           System.out.println();
       }
   }
    public static void main(String []args){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }
}
