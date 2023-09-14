package mostAskedQuestions;

import java.util.Arrays;

public class SplitNumbers {

	public static void main(String[] args) {
		int n= 1999;
		
		String s= String.valueOf(n);
		
		String[] s1=s.split("");
		
		System.out.println(Arrays.toString(s1));
	}
}
