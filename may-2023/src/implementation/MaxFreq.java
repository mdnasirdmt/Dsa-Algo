package implementation;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class MaxFreq {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 1, 1 };
		LinkedHashMap<Integer, Integer> hashMap= new LinkedHashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
		}

		System.out.println(hashMap);
		
		int max=0;
		int y=0;
		for (int i = 0; i < hashMap.size(); i++) {
			int x=hashMap.get(arr[i]);
			
			if(x>max) {
				max=x;
				y=arr[i];
			}
		}
		System.out.println(y);
	}

}
