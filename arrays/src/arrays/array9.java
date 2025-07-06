package arrays;
import java.util.*;
public class array9 {
	public static void main(String[] args) {
	 int[] arr = {1, 10, 10, 2};

     int[] result = withoutTen(arr);

     // Print the modified array
     System.out.println("Result: " + Arrays.toString(result));
 }

 public static int[] withoutTen(int[] nums) {
     int[] result = new int[nums.length];
     int index = 0;

     // Copy non-10 elements to the result
     for (int num : nums) {
         if (num != 10) {
             result[index] = num;
             index++;
         }
     }

     // Remaining positions are already 0 by default
     return result;
}
}