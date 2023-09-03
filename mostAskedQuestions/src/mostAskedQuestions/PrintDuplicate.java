package mostAskedQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 4, 3, 5 };

		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
		}

		// to find number of occurance in array
		int[] freq = new int[m + 1];

		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}

//		System.out.println(Arrays.toString(freq));

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (freq[arr[i]] > 1) {
//				System.out.print(arr[i]+" ");

				if (!list.contains(arr[i]))
					list.add(arr[i]);
			}
//				System.out.print(freq[arr[i]]+" ");	
		}

		System.out.println(list);
	}
}

/*
 * print the number that occurance is more than one example arr=[3,2,5,4,3,5],
 * output= 3,5
 */