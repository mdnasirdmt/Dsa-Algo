package patternsProblem;

public class FloyedSquare {

	public static void main(String[] args) {

		int n = 24;

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}

	}

}
//1 2 3 4
//5 6 7 8
//9 10 11 12