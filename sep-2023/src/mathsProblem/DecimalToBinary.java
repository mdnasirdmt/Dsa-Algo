package mathsProblem;

public class DecimalToBinary {

	public static void main(String[] args) {

		int n = 8;
		decimalToBinary(n);

	}

	private static void decimalToBinary(int n) {

		String rem = "";
		int x = n;
		while (x >= 0) {
			rem += n % 2 + "";
			n = n / 2;
			x--;
			if (n == 0)
				break;
		}

		System.out.println("decimal to binary  =  " + new StringBuilder(rem).reverse().toString());
	}

}

//convert decimal to binary number example n= 4; output= 100
