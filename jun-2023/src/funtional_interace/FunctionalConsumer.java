package funtional_interace;

import java.util.function.Consumer;

public class FunctionalConsumer {

	public static void main(String[] args) {

		Consumer<Integer> con = (n) -> System.out.println("" + n * n);
		con.accept(3);

		Consumer<String> str = (msg) -> System.out.println("message : " + msg);

		str.accept("Hello Everyone");

	}

}

/*
 * The Consumer<T> functional interface in Java represents an operation that
 * accepts a single input argument of type T and performs some action or side
 * effect with that argument. It does not return any result.
 * 
 * The main purpose of Consumer<T> is to encapsulate behavior that consumes or
 * processes an input value. It allows you to define an action or operation as
 * an object, which can be passed around, composed, or used in various contexts.
 * 
 * Here's an example to illustrate the use of Consumer<T>:
 */