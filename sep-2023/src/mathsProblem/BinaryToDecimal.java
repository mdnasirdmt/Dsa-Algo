package mathsProblem;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int n = 111;
		String s = String.valueOf(n);

		// Use Java Streams to reverse the string
		String s1 = new StringBuilder(s).reverse().toString();
//		System.out.print(s1);

		String[] str = s1.split("");
//		System.out.println(Arrays.toString(str));

		int bin = 0;
		for (int i = str.length - 1; i >= 0; i--) {
			int digit = Integer.parseInt(str[i]);
//			System.out.print(digit+ " ");
			bin += Math.pow(2, i) * digit;
		}
		System.out.println("binary to decimal  =  "+bin);

		////////////////////////////////

//		this is inbuilt way of converting to decimal
		System.out.println("binary to decimal  =  "+Integer.parseInt("101", 2));

	}

}

/*
 * convert binary number to decimal number example n= 1000 , output= 8
 */


