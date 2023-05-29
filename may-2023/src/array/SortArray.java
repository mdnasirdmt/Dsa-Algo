package array;

import java.util.Arrays;
import java.util.LinkedList;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 5, 25, 15, 30, 12, 8, 18 };
//		int[] asc=new int[arr.length];
//		int[] des=new int[arr.length];
		
		LinkedList<Integer> asc= new LinkedList<>();
		LinkedList<Integer> des= new LinkedList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>15)
//				des[i]=arr[i];
				des.add(arr[i]);
			else
				asc.add(arr[i]);
				
		}

//		System.out.println(Arrays.toString(des));
		System.out.println(asc);
		System.out.println(des);
		asc.addAll(des);
		System.out.println(asc);
	}

}

/*
 * Array of numbers.Sort array such that number>15 are sorted in descending
 * order and numbers<15 are sorted in ascending order .
 */