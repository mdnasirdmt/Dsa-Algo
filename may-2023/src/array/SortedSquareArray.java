package array;

import java.util.Arrays;

public class SortedSquareArray {

	public static void main(String[] args) {
		int[]arr={4, 5, 6, 8, 9};
		int l=0;
		int r=arr.length-1;
		int[]arr1=new int[arr.length];
		for (int i = arr.length-1; i >=0; i--) {
			if(Math.abs(arr[l])>arr[r]) {
				arr1[i]=arr[l]*arr[l];
				l++;
			}else {
				arr1[i]=arr[r]*arr[r];
				r--;
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=arr1[i];
//		}
		System.out.println(Arrays.toString(arr1));
	}

}
