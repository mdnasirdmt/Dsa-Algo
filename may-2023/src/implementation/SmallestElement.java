package implementation;

import java.util.HashSet;
import java.util.Iterator;

public class SmallestElement {

	public static void main(String[] args) {
		int[]arr= {1,2,1,3,6,4};
//		int[]arr= {1,2,3};
		
		System.out.println(findSmmaller(arr));

	}

	private static int findSmmaller(int[] arr) {
		HashSet<Integer> hashSet= new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				hashSet.add(arr[i]);
		}
		System.out.println(hashSet);
		
		for(int i=1;i<=arr.length;i++) 
			if(!hashSet.contains(i))
				return i;
			
			
		return arr.length+1;
	}

}

/*
 * case 1 arr=[1,2,1,3,6,7] output= 5
 * 
 * case 2 arr=[1,2,3] output= 4
 * 
 * hint- print smallest element that is not present in array. case 1 smallest is
 * 5. case 2 smaller is 4.
 * 
 * output should be greater than 0
 */
