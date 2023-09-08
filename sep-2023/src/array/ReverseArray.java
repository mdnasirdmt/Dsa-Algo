package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int swap = arr[l];
			arr[l] = arr[r];
			arr[r] = swap;

			l++;
			r--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
