package array;

public class LargestInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 45, 7, 434, 2, 500, 34, 234, 456 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		System.out.println(max);

	}

}
