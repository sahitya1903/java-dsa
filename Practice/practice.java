// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         System.out.println("Hi! It's Sahitya here..");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius of circle in cm:");
//         float rad=sc.nextFloat();
//         sc.close();
//         double perimeter=2*22/7f*rad;
//         System.out.print("Perimeter of Circle is: "+perimeter+" cm");
//     }
// }


// import java.util.Arrays;

// public class practice{
//   public static void main(String[] args) {
//     String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
//     Arrays.sort(cars);
//     for (String i : cars) {
//       System.out.println(i);
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {

//   }
// }

class Solution1 {
  public int longestNiceSubarray(int[] nums) {
      int min=1;
      for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              int len=0;
              for(int k=j+1;k<nums.length;k++){
                  if((nums[j] & nums[k])==0){
                      len++;
                  }
              }
              min=Math.max(len,min);
          }
      }
      return min;
  }

  public static void main(String[] args) {
    Solution1 s=new Solution1();
    int nums[]={1,3,8,48,10};
    System.out.println(s.longestNiceSubarray(nums));
  }
}

