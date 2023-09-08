package mathsProblem;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 9;
		boolean f = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				f = false;

			}
		}
		if (f) {
			System.out.println("prime ");
		} else {
			System.out.println("not prime");
		}

		

	}

}
