package string;

public class StringCompression {

	static void compress(String s) {

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {

			int c = 1;

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				c++;
				i++;
			}
			sb.append(s.charAt(i));
			if (c > 1) {
				sb.append(c);
			}
		}

		System.out.println(sb);

	}

	public static void main(String[] args) {
		String s = "aaabbaccd"; // output= a3b2c2d
//		String s = "aaaaabbbaxxxxaaaaaa";

		compress(s);

	}

}
