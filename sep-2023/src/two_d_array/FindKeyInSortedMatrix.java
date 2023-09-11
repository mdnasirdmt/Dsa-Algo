package two_d_array;

import java.util.Arrays;

public class FindKeyInSortedMatrix {
	public static void main(String[] args) {
		int[][] mat = { { 10, 15, 20 }, { 15, 17, 21 }, { 18, 19, 22 } };

		int key = 22;

		for (int i = 0; i < mat.length; i++) {
			rowArray(mat[i], key);
		}

	}

	private static void rowArray(int[] arr, int key) {

//		System.out.println(Arrays.toString(arr));

		int f = binary(arr, key);
		if (f == -1)
			System.out.println("key not found ");
		else
			System.out.println("key found");
	}

	private static int binary(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key)
				start = mid + 1;
			else
				end = mid - 1;

		}
		return -1;
	}

}
