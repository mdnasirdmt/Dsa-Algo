package implementation;

import java.util.Arrays;

public class MoveAllZerostoEnd {
	
	public static void main(String[] args) {
		
		int[]arr= {1,3,2,0,6,0,5,9}; //[1,3,2,6,5,9,0,0]
		
		move(arr,arr.length);
	}

	private static void move(int[] arr, int length) {
		
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[c++]=arr[i];
				System.out.println( Arrays.toString(arr));
			}
		}
//		System.out.println(Arrays.toString(arr));
		while(c<length) {
			arr[c++]=0;
			System.out.println(Arrays.toString(arr));
		}
		
//		System.out.println(Arrays.toString(arr));
		
	}

}
