package patternsProblem;

public class HollowPat {

	public static void main(String[] args) {
		char[][] hPat = new char[4][4];

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat.length; j++) {
				hPat[i][j] = '*';
			}
		}

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat.length; j++) {
				if (i == 0 || j == 0 || i == hPat.length - 1 || j == hPat[i].length - 1)
					System.out.print(hPat[i][j]);
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}
