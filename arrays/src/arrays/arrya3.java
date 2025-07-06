package arrays;
import java.util.*;
public class arrya3 {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 34, 56, 7};
        int searchElement = 90;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                index = i;
                break;
            }
        }
        System.out.println(index);// TODO Auto-generated method stub

	}

}
