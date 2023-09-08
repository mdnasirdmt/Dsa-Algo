package patternsProblem;

public class FloyedTringle {

	public static void main(String[] args) {
		int n = 5;
		int counter = 1;
		floyed(n, counter);

	}

	private static void floyed(int n, int counter) {
		for (int i = 1; i <= n; i++) {
			int c = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}

}
