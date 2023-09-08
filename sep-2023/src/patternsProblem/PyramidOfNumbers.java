package patternsProblem;

public class PyramidOfNumbers {

	public static void main(String[] args) {
		pyramidNum(5, 5);
	}

	static void pyramidNum(int row, int col) {

		for (int i = 0; i <row; i++) {
			int p = 1;
			for (int j = 1; j <= col - i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();
		}

	}

}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
