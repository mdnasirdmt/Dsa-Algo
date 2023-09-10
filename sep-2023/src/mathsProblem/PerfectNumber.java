package mathsProblem;

public class PerfectNumber {
	public static void main(String[] args) {
		int n = 7;

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;

			}
		}
		if (sum == n)
			System.out.println("Number is perfect " + n);
		else
			System.out.println("Not perfect ");
	}

}

/*
 * Write program weather the number is PERFECT NUMBER or not? Def: Perfect
 * number, a positive integer that is equal to the sum of its proper divisors.
 * The smallest perfect number is 6, which is the sum of 1, 2, and 3.
 */
