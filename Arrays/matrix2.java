public class matrix2 {
    public static void psdiagonalsum(int matrix[][]) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (i==j){
                    sum1+=matrix[i][j];
                }
                else if(i+j==matrix[0].length-1){
                    sum2+=matrix[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal sum:"+sum1);
        System.out.println("Secondary Diagonal sum:"+sum2);

    }

    public static void diagonalsum(int matrix[][]) {    //O(n^2)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (i==j | i+j==matrix[0].length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal sum:"+sum);

    }
    public static void diagonalsum1(int matrix[][]) {    //O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if (i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Diagonal sum:"+sum);

    }
    public static void main(String[] args) {
        int matrix[][]=
        {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        psdiagonalsum(matrix);
        diagonalsum(matrix);
        diagonalsum1(matrix);
    }
}
