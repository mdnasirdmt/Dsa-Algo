package mathsProblem;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int n = 10100;
		binaryToDecimal(n);

//		this is inbuilt way of converting to decimal
		System.out.println("binary to decimal  =  " + Integer.parseInt("101", 2));

	}

	private static void binaryToDecimal(int n) {
		String s = String.valueOf(n);

		// Use Java Streams to reverse the string
		String s1 = new StringBuilder(s).reverse().toString();

		String[] str = s1.split("");

		int bin = 0;
		for (int i = str.length - 1; i >= 0; i--) {
			int digit = Integer.parseInt(str[i]);
			bin += Math.pow(2, i) * digit;
		}
		System.out.println("binary to decimal  =  " + bin);

	}

}

/*
 * convert binary number to decimal number example n= 1000 , output= 8
 */
