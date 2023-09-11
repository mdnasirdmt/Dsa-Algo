package two_d_array;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// printing matrix values
		printMatrix(mat);

		// print diagonal
		printDigonal(mat);

	}

	private static void printDigonal(int[][] mat) {
		int sum = 0;

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (i == j) {
					sum += mat[i][j];
				}
				if (i + j == mat[i].length - 1) {
					if (i != j)
						sum += mat[i][j];
				}
			}

		}
		System.out.println("sum of diagonals " + sum);

	}

	static void printMatrix(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();

		}

	}

}
//int[][] mat = { 
//		{ 1, 2, 3 }, 
//		{ 4, 5, 6 }, 
//		{ 7, 8, 9 } };

//diagonal values are 1,,5,,9 and 3,5,7
//sum of diagonal 1 = 1+5+9= 15
//sum of diagonal 2 = 3+7= 10
//sum of diagonals = 25
