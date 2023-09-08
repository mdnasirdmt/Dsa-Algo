package array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 3, 4,10 };
		int n = 10;
		int left = 0;
		int right = arr.length - 1;

		Arrays.sort(arr);

		int s= binary(arr, left, right, n);
		
		if(s==-1)
			System.out.println("not found ");
		else
			System.out.println("found value is "+ s);
	}

	private static int binary(int[] arr, int left, int right, int n) {
		
		int mid = left+(right-left)/2;
		
		while(left<=right) {
			if(arr[mid]==n) {
				return arr[mid];
			}
			else if(arr[mid]<n) {
				return binary(arr, mid+1, right, n);
			}
			else if(arr[mid]>n) {
				return binary(arr, left, mid-1, n);
			}
			left++;
		}
		return -1;

	}
}
