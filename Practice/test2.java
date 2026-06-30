public class test2 {
    public static int[][] transpose(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] ans = transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}