package funtional_interace;

import java.util.function.Supplier;

public class FunctionalSuplier {

	public static void main(String[] args) {
		double n = 2.0;

		// square root of number
		Supplier<Double> sup = () -> Math.sqrt(n);
		System.out.println("sqaure root : " + sup.get());

		// find randome number between 0 to 1
		Supplier<Double> sup1 = () -> Math.random();
		System.out.println("randome number : " + sup1.get());

	}

}

/*
 * The Supplier<T> functional interface in Java is used to represent a supplier
 * of results. It does not take any arguments and produces a result of type T.
 * It is commonly used when you need to generate or provide values without
 * taking any input.
 * 
 * The main purpose of Supplier<T> is to encapsulate a behavior that supplies or
 * generates a value on demand. It allows you to represent a source or provider
 * of values as an object, which can be called to obtain the result whenever
 * needed.
 * 
 * Here's an example to illustrate the use of Supplier<T>:
 */