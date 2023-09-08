package patternsProblem;

public class HalfInvertedPyramidPat {

	public static void main(String[] args) {
		char[][] hPat = new char[5][6];

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat[i].length; j++) {
				hPat[i][j] = '*';
			}
		}

		for (int i = 0; i < hPat.length; i++) {
			for (int j = 0; j < hPat.length - i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}

//* * * * * *
//* * * * *
//* * * * 
//* * * 
//* * 
//* 
