package subsequence;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		int[] arr = { 3, 12, 4, 5, 6, 67 };

		findSub(arr, arr.length);
	}

	private static void findSub(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				int[] subArray = Arrays.copyOfRange(arr, i, j);
				System.out.println(Arrays.toString(subArray) + " ");
			}
		}

	}

}
