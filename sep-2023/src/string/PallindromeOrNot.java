package string;

public class PallindromeOrNot {
	public static void main(String[] args) {
		String str = "noon"; // racecar; madam;
		System.out.println(checkP2(str));

		checkP1(str);

	}

//	first way
	static void checkP1(String str) {
		String sb = new StringBuilder(str).reverse().toString();

		if (sb.equals(str)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

//	second way
	private static boolean checkP2(String str) {

		for (int i = 0; i < str.length(); i++) {
			int n = str.length();
			if (str.charAt(i) != str.charAt(n - 1 - i)) {
				return false;
			}
		}

		return true;

	}

}

//check string is pallindrome or not
