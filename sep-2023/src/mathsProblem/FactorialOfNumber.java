package mathsProblem;

public class FactorialOfNumber {

	public static void main(String[] args) {

		long n = 6;

		factorial(n);

//		this is recursive way of finding factorial
		long fact = findFactorial(n);
		System.out.println("factorial is " + fact);

	}

	private static long findFactorial(long n) {

		if (n < 0)

			throw new IllegalArgumentException("Factorial is not defined for negative numbers");

		if (n == 0 || n == 1)
			return 1;

		return n * findFactorial(n - 1);
	}

	private static void factorial(long n) {

		if (n < 0)

			throw new IllegalArgumentException("Factorial is not defined for negative numbers");

		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("factorial is " + fact);

	}

}
