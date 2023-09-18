package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MultiDiamentional {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//		way 1 of addding 
		list.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
		System.out.println(list);

//		way 2
		ArrayList<Integer> insideList1 = new ArrayList<>();
		insideList1.add(1);
		insideList1.add(2);
		insideList1.add(4);
		insideList1.add(5);
		insideList1.add(7);
		insideList1.add(2);

		list.add(insideList1);

		System.out.println(list);

//		access value using for loop
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}
}
