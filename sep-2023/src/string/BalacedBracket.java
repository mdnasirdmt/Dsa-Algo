package string;

import java.util.Stack;

public class BalacedBracket {

	public static void main(String[] args) {
//		String str = "](){}[]";
		String str = "{}([](){})";
//		String str= "{({]";
//		String str= "()({}[])";
//		String str = "({[]})";

		checkBalanced(str);
	}

	private static void checkBalanced(String str) {
		boolean f = true;

		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				s.add(str.charAt(i));
			} else {
				if (str.charAt(i) == ')') {
					if (s.isEmpty() || s.pop() != '(') {
						f = false;
					}
				}
				if (str.charAt(i) == '}') {
					if (s.isEmpty() || s.pop() != '{') {
						f = false;
					}
				}
				if (str.charAt(i) == ']') {
					if (s.isEmpty() || s.pop() != '[') {
						f = false;
					}
				}
			}
		}
		
		if(f)
			System.out.println("Balanced ! ");
		else
			System.out.println("Not Balanced ! ");

	}

}
