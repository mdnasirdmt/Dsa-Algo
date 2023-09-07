package mathsProblem;

public class BinomialCoefficient {

	public static void main(String[] args) {

		int n = 5;
		int k = 2;

		bc(n, k);

	}

	private static void bc(int n, int k) {

		long n1 = factorial(n);
		long k1 = factorial(k);
		long nk = factorial(n - k);
		long nk1 = k1 * nk;

		long c = n1 / nk1;
		System.out.println("bionomial coefficient " + c);

	}

	static long factorial(int x) {

		if (x < 0)
			throw new IllegalArgumentException("we only accept positive number ");

		if (x == 0 || x == 1)
			return 1;

		return x * factorial(x - 1);
	}

}

/*
 * find bionomial coefficient C(n,k)= n!/ k!*(n-k)!
 * 
 * 
 * So, C(5,2)=10, which means there are 10 ways to choose 2 items from a set of
 * 5 distinct items.
 */
