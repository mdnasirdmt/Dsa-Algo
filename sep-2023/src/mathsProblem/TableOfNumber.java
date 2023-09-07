package mathsProblem;

public class TableOfNumber {
	public static void main(String[] args) {
		int n = 5;
		int limit = 10;

		table(n, limit);
	}

	private static void table(int n, int limit) {

		for (int i = 1; i <= limit; i++) {
			System.out.println(n + " * " + i + " = " + +n * i);
		}

	}

}
