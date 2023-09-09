package array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 3, 2 };
		int n = arr.length;
		while (n != 0) {
			for (int i = 0; i < arr.length - 1; i++) {

				int j = i + 1;
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
			n--;
		}
		System.out.println("sorted array " + Arrays.toString(arr));
	}

	static void swap(int[] arr, int i, int j) {
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}
}
