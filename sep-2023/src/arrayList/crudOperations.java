package arrayList;

import java.util.ArrayList;

public class crudOperations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);

		// adding at index
		list.add(3, 5);
		System.out.println(list);

		list.remove(4);
		System.out.println(list);

		list.set(3, 7);
		System.out.println(list);

		int n = list.get(3);
		System.out.println(n);

	}

}
