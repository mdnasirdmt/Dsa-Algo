package mathsProblem;

public class PowerOfNumber {
	public static void main(String[] args) {
		int base = 3;
		int exponent = 3;

		powerOfNuber(base, exponent);

//		this is inbuilt way of finding power

		double result = Math.pow(base, exponent);
		System.out.println(base + " raised to the power of " + exponent + " is " + result);
	}

	private static void powerOfNuber(int base, int exponent) {
		int pow = 1;
		for (int i = 0; i < exponent; i++) {
			pow *= base;
		}

		System.out.println("Power of " + base + " is " + pow);

	}

}
