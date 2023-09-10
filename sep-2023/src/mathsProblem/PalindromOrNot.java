package mathsProblem;

public class PalindromOrNot {
	public static void main(String[] args) {
		int n = 1001;
		String s = String.valueOf(n);
		String str = new StringBuilder(s).reverse().toString();

		if (s.equals(str))
			System.out.println(n + " is Pallindrome");
		else
			System.out.println(n + " is Not palindrome ");
	}

}
