package implementation;

import java.util.Arrays;

public class CountElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 1, 1 };
		int[]freq=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		System.out.println(Arrays.toString(freq));
		
		for (int i = 0; i < arr.length; i++) {	
			if(arr[i]!=visited)
				System.out.println(arr[i]+"- "+freq[arr[i]]);
		}
		
	}

}
