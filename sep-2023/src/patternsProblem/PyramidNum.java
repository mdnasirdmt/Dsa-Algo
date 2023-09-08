package patternsProblem;

public class PyramidNum {

	public static void main(String[] args) {

		pyramid(5, 5);

	}

	private static void pyramid(int row, int col) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
//1 
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
