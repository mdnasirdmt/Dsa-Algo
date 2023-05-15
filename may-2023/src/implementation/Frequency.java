package implementation;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4, 1, 1 };
		int n = arr.length;
		int[] freq = new int[n];
		int visited = -1;
		for (int i = 0; i < n; i++) {
			int c = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					c++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = c;
			}
		}
System.out.println(Arrays.toString(freq));
		for (int i = 0; i < n; i++) {
			if (freq[i] != visited) {
				System.out.println(arr[i] + " " + freq[i]);
			}
		}

	}

}

/*
 * with the rest of the elements in the array to count the frequency. Added a
 * variable count to keep track of the frequency of each element. Marked the
 * visited elements in the freq array with a value of -1 to avoid counting them
 * again. Printed the element and its frequency for elements that are not marked
 * as visited. With these changes, the code will correctly find the frequency of
 * each element in the array and display the result.
 */