package patternsProblem;

public class HalfPyramid {
	public static void main(String[] args) {

		halfPyramid(5, 5);

	}

	private static void halfPyramid(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
