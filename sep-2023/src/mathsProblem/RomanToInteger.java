package mathsProblem;

public class RomanToInteger {
	public static void main(String[] args) {
//		I= 1; V=5; X=10; L=50; C=100; D=500; M=1000; in roman 
		String str = "III";

		romanToInteger(str);

	}

	private static void romanToInteger(String str) {

		int num = 0, ans = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			switch (str.charAt(i)) {
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;
			case 'L':
				num = 50;
				break;
			case 'C':
				num = 100;
				break;
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;

			}
			if (num * 4 < ans)
				ans -= num;
			else
				ans += num;
		}

		System.out.println("roman to integer after convertion " + ans);

	}

}

//I (1) can be placed before V (5) or X (10).
//X (10) can be placed before L (50) or C (100).
//C (100) can be placed before D (500) or M (1000).

//By using num*4
//as the
//comparison in
//the code, you
//are effectively
//checking whether
//the current
//numeral is
//a valid numeral for subtraction.Here's
//why num*4
//is used:
//
//If num is 1(representing'I'),
//then num*4 is 4,
//which is
//the largest
//value that
//can be
//subtracted in
//
//Roman numerals (IV for 4).
//If num is 10 (representing 'X'), then num * 4 is 40, which is the largest value that can be subtracted in
//
//Roman numerals (XL for 40).
//If num is 100 (representing 'C'), then num * 4 is 400, which is the largest value that can be subtracted in
//
//Roman numerals (CD for 400).
//If num represents any of these valid subtractive numerals and num * 4 is less than ans, it means that subtraction should occur, and num is subtracted from ans. Otherwise, if num * 4 is greater than or equal to ans, it means that the numeral should be added to ans because it doesn't follow the subtraction rules.