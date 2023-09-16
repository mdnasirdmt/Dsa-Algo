package bit_manipulation;

public class PowerOfTwoOrNot {

	public static void main(String[] args) {
		int n = 8;

		System.out.println(checkPowerOfTwo(n));
	}

	static boolean checkPowerOfTwo(int n) {

		if ((n & (n - 1)) == 0) {
			return true;
		} else {
			return false;
		}
	}

}
//
//
//(n&(n-1)) ==0 
//this is a formula to find check power of two
