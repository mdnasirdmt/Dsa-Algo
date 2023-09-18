package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapNumber {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		System.out.println(list);
		int indx1 = 3;
		int indx2 = 6;

		swapNum(list, indx1, indx2);

	}

	private static void swapNum(ArrayList<Integer> list, int indx1, int indx2) {

		int tem = list.get(indx1);
		list.set(indx1, list.get(indx2));
		list.set(indx2, tem);

		System.out.println(list);

	}

}
