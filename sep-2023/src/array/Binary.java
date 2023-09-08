package array;

public class Binary {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 10, 13, 21 };
		int key = 10;
		int s = binary(arr, key);

		if (s == -1)
			System.out.println("not found ");
		else
			System.out.println("found at index "+ s);

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
