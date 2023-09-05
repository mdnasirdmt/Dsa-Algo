package mostAskedQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		String str = "geekforgeeks";
		char[] ch = str.toCharArray();
//		System.out.println(Arrays.toString(ch));
		ArrayList<Character> chr = new ArrayList<Character>();

		int m = 0;
		for (int i = 0; i < ch.length; i++) {
			m = Math.max(m, ch[i]);
		}

//		System.out.println(m);
		int[] fre = new int[m + 1];
		for (int i = 0; i < ch.length; i++) {
			fre[ch[i]]++;

		}

//		System.out.println(Arrays.toString(fre));

		for (int i = 0; i < str.length(); i++) {
			if (fre[ch[i]] > 1) {
				if (!chr.contains(ch[i])) {
					chr.add(ch[i]);
				}
			}
		}
		System.out.println(chr);

	}

}

//remove the character that is more than once
//string = aabbccd output= gek