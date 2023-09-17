package recursion;

public class PrintNumberInDecreasing {

	public static void main(String[] args) {
		printNum(10);
		System.out.println();
		printNum1(10);
	}

	private static void printNum(int i) {
		System.out.print(i + " ");

		if (i != 1)
			printNum(i - 1);
	}

	private static void printNum1(int i) {
		if (i == 1) {

			System.out.print(i);
			return;
		}

		System.out.print(i + " ");
		printNum(i - 1);
	}

}
