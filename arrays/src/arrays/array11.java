package arrays;
import java.util.*;
public class array11 {

	public static void main(String[] args) {
		 int[] nums = {1, 4, 1, 4, };

	        boolean hasOne = false;
	        boolean hasFour = false;

	        // Loop through array to check for 1 and 4
	        for (int num : nums) {
	            if (num == 1) {
	                hasOne = true;
	            }
	            if (num == 4) {
	                hasFour = true;
	            }
	        }

	        // Print true only if both 1 and 4 are present
	        System.out.println(hasOne && hasFour);// TODO Auto-generated method stub

	}

}
