package backTracking;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		int[] arr = new int[5];

		changeArray(arr, 0, 1);
		printArray(arr);
	}

	static void changeArray(int[] arr, int i, int val) {

		if (i == arr.length) {
			printArray(arr);
			return;

		}

		arr[i] = val;
		changeArray(arr, i + 1, val + 1);
		arr[i] = arr[i] - 2;
//		printArray(arr);
	}

	static void printArray(int[] arr) {

		System.out.println(Arrays.toString(arr));
	}

}

//in this we are assigning values to the array from index 0  to n-1 ; 
//and then decreasing by 2, using backtracking concept.
