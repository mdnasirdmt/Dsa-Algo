package mostAskedQuestions;

import java.util.LinkedList;

public class SplitNumber {

	public static void main(String[] args) {
		int n = 100; // output= 1,0,0

		split(n);

	}

	private static void split(int n) {
		LinkedList<Integer> list = new LinkedList<>();

		while (n > 0) {
			list.push(n % 10);
			n = n / 10;
		}
//		System.out.println(list);

		/////////////////
		for (int i = 0; i <= list.size() + 1; i++) {
			if (i == list.size() + 1)
				System.out.print(list.pop() + "");
			else
				System.out.print(list.pop() + ",");
		}

	}

}
