import java.util.Arrays;
//TC-O(n log(n))
public class minabsdifference {
    public static void main(String[] args) {
        int A[]={2,1,3};
        int B[]={1,3,2};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for (int i = 0; i < A.length; i++) {
              minDiff+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Min Absolute Difference:"+minDiff);
    }
}
