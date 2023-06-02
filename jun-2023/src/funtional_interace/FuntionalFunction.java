package funtional_interace;

import java.util.*;
import java.util.function.Function;

public class FuntionalFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// make sqaure of number
		Function<Integer, Integer> sqrt = (n) -> n * n;
		System.out.print("Enter : ");
		System.out.println("square is : " + sqrt.apply(sc.nextInt()));

		// convert string in integer
		System.out.print("Enter : ");
		Function<String, Integer> convertToInt = (n) -> Integer.valueOf(n);
		System.out.println("converted in integer : " + convertToInt.apply(sc.next()));

	}
}
/*
 * The Function<T, R> functional interface in Java represents a function that
 * accepts an input of type T and produces an output of type R. It is often used
 * to transform or convert one value into another.
 * 
 * The primary purpose of Function<T, R> is to encapsulate a behavior or
 * transformation logic that takes an input and produces a corresponding output.
 * It allows you to define a function as an object, which can be passed around,
 * composed, or used in various operations.
 * 
 * Here's an example to illustrate the use of Function<T, R>:
 */