package mostAskedQuestions;

import java.util.Arrays;

public class CountCommonElement {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 3, 4, 5 };
		int[] a2 = { 4, 4, 3, 2, 1, 6 };

//		output= 4

		System.out.println(countCommon(a1, a2));
	}

	private static int countCommon(int[] a1, int[] a2) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		int c = 0;

		int i = 0;
		int j = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] == a2[j]) {
				c++;
				i++;
				j++;
			} else if (a1[i] < a2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return c;

	}

}

//This code sorts both arrays a1 and a2, and then it uses two pointers i and j to iterate through both arrays, 
//comparing elements at each step. If the elements are equal, it increments the commonCount. 
//If the element in a1 is smaller, it increments i, 
//and if the element in a2 is smaller, it increments j. This process continues until one of the arrays is fully processed.
