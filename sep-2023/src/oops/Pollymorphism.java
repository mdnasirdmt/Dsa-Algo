package oops;

public class Pollymorphism {

	public static void main(String[] args) {

		System.out.println(calculator(12, 13));
		
		System.out.println(calculator(12.11, 13));


	}

	static int calculator(int a, int b) {
		return a + b;
	}

	static double calculator(double a, int b) {
		return a + b;
	}

}

//Here we are using calculator method two times with different parameter 
//when we use more than one method with same name in one class then it is called method overloading 
//
//polymorphism means many forms and it have two types 
//1. method overloading( static polymorphism)
//2. method overriding (dynamic polymorphism)
//
//dynamic polymorphism is part of inheritance
//
//in this we explained about method overloading
