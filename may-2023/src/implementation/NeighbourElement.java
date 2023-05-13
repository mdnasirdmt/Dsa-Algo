package implementation;

public class NeighbourElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 8, 75 };
		int count = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] % 2 == 0 && arr[i + 1] % 2 != 0 || arr[i - 1] % 2 != 0 && arr[i + 1] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}

/*
 * Given an array of integers, find out the number of elements with exactly one
 * odd neighbour and one even neighbour.
 * 
 * 
 * A = [1,2,2,3,4,8,75] output- 4
 */