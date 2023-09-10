package mathsProblem;

public class PallindromOrNot {
	public static void main(String[] args) {
		int n = 1001;

		int r = n;
		int rev = 0;

		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}

		if (r == rev)
			System.out.println(r + " is Pallindrome");
		else
			System.out.println(r + " is Not palindrome ");
	}

}
