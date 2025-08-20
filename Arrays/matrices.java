import java.util.*;
public class matrices {
    public static boolean search (int matrix[][],int key) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (key==matrix[i][j]) {
                    System.out.print("Key found at index: ("+i+","+j+") ");
                    return true;
                }
            }
        }
        return false;
    }
    public static void maxmin(int matrix[][]) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]>max) {
                    max=matrix[i][j];
                }
                else if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Value in Matrix:"+max);
        System.out.println("Minimum Value in Matrix:"+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 4);
        maxmin(matrix);
        sc.close();
    }
    
}
