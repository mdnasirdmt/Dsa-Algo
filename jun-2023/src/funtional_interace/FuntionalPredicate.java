package funtional_interace;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuntionalPredicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 23, 4, 5, 2, 3, 5, 6, 8, 6, 7, 11, 41, 31, 56);

		Predicate<Integer> isEven = n -> n % 2 == 0;

		List<Integer> integers = filter(list, isEven);

		System.out.println(integers);
	}

	private static List<Integer> filter(List<Integer> list, Predicate<Integer> isEven) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer i : list)
			if (isEven.test(i))
				arrayList.add(i);
		return arrayList;
	}

}

/*
 * The Predicate<T> functional interface in Java is used to represent a
 * predicate, which is a boolean-valued function that takes one argument of type
 * T and returns a boolean result. It is commonly used for filtering elements
 * based on a condition.
 * 
 * The main purpose of Predicate<T> is to test whether a given input satisfies a
 * specific condition or criteria. It provides a way to express a condition as
 * an object, which can be passed around and used to evaluate elements.
 * 
 * Here's an example to illustrate the use of Predicate<T>:
 */