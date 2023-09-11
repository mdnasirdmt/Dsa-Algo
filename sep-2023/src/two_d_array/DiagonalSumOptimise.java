package two_d_array;

public class DiagonalSumOptimise {
	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		sumOfDigonal(mat);
	}

	private static void sumOfDigonal(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			sum += mat[i][i];

			if (i != mat.length - 1 - i)
				sum += mat[i][mat.length - i - 1];


		}
		System.out.println("sum of diagonals = "+sum);

	}

}
