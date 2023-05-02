package revisionDsa;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int khoj = 1;
		int l = 0;
		int r = arr.length - 1;
		int x = binaryKhoj(arr, l, r, khoj);

		System.out.println("khoj value = " + x);
	}

	private static int binaryKhoj(int[] arr, int l, int r, int khoj) {

		int mid = l + (r - l) / 2;

		while (l <= r) {

			if (arr[mid] == khoj) {
				
				return arr[mid];
				
			} else if (arr[mid] < khoj) {

				return binaryKhoj(arr, mid + 1, r, khoj);

			} else {
				return binaryKhoj(arr, l, mid - 1, khoj);
			}
		}

		return mid;

	}

}
/*
 * Binary Search Approach:
 * 
 * Binary Search is a searching algorithm used in a sorted array by repeatedly
 * dividing the search interval in half. The idea of binary search is to use the
 * information that the array is sorted and reduce the time complexity to O(Log
 * n).
 * 
 * Binary Search Algorithm: The basic steps to perform Binary Search are:
 * 
 * Begin with the mid element of the whole array as a search key. If the value
 * of the search key is equal to the item then return an index of the search
 * key. Or if the value of the search key is less than the item in the middle of
 * the interval, narrow the interval to the lower half. Otherwise, narrow it to
 * the upper half. Repeatedly check from the second point until the value is
 * found or the interval is empty.
 */
