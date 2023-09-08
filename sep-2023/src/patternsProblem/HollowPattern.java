package patternsProblem;

public class HollowPattern {

	public static void main(String[] args) {

		hollow_pat(4, 5);

	}

	private static void hollow_pat(int totRow, int totCol) {

		for (int i = 1; i <= totRow; i++) {

			for (int j = 1; j <= totCol; j++) {

				if (i == 1 || i == totRow || j == 1 || j == totCol) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
