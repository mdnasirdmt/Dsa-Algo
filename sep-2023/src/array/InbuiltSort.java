package array;

import java.util.Arrays;

public class InbuiltSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2 };
		
//		Arrays.sort(arr);
		Arrays.sort(arr, 0, 3); // it will sort the array starting index to ending index 0 is start and 3 is end
		System.out.println(Arrays.toString(arr));

	}

}
