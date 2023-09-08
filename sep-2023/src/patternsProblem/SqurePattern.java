package patternsProblem;

import java.util.Arrays;

public class SqurePattern {

	public static void main(String[] args) {
		char[][] hPat = new char[4][4];

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat.length; j++) {
				hPat[i][j] = '*';
			}
		}

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat.length; j++) {
				System.out.print(hPat[i][j] + " ");

			}
			System.out.println();
		}

	}

}
