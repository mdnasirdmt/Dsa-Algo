package array;

public class MaxSumOfSubArray {
	public static void main(String[] args) {
//		int[] arr = { 1, -2, 6, -1, 3 };
		int[] arr = { 2, 4, 6, 8, 10 };

		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				String s = "";
				int s1 = 0;
				for (int k = i; k <= j; k++) {
					s1 += arr[k];
					s += arr[k] + " ";
				}
//				System.out.println(s1);
//				System.out.println(s);

				maxSum = Math.max(maxSum, s1);
			}
//			System.out.println("----------");

		}

		System.out.println("max sum of sub array is = " + maxSum);
	}

}
