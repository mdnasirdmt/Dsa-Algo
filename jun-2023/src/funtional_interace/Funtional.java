package funtional_interace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Funtional {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Mr. India");
		arrayList.add("Mother teressa");
		arrayList.add("james Bond");
		arrayList.add("Alif Laila");
		arrayList.add("Dil to pagal hai");
		arrayList.add("dilwale");

		Collections.sort(arrayList, (name1, name2) -> name1.length() - name2.length());
		for(String name:arrayList)
			System.out.println(name);
	}

}
