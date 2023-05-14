package implementation;

import java.util.Arrays;

public class MaxElement {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 1, 1 };
		int[] freq=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
//			System.out.print(freq[arr[i]]+" ");
		}
//		System.out.println();
		
//		System.out.println(Arrays.toString(freq));
		
		int c=0;
		int max=0;
		for (int i = 0; i < freq.length; i++) {
//			System.out.print(freq[i] +" ");
			if(freq[i]>max) {
				max=freq[i];
			}
		}
		System.out.println(max);

	}

}
