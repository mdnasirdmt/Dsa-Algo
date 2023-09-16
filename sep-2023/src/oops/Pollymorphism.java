package oops;

public class Pollymorphism {

	public static void main(String[] args) {
		// method overloading
		System.out.println(calculator(12, 13));
		System.out.println(calculator(12.11, 13));

		// metod overriding
		Animal a1 = new Animal();
		a1.eat();

		Animal a2 = new Cow();
		a2.eat();

	}

	static int calculator(int a, int b) {
		return a + b;
	}

	static double calculator(double a, int b) {
		return a + b;
	}

}

//method overriding 
class Animal {
	void eat() {
		System.out.println("Animal eats anythig..");
	}
}

class Cow extends Animal {

	void eat() {
		System.out.println("cow eats grass..");
	}

}

//method overloading
//Here we are using calculator method two times with different parameter 
//when we use more than one method with same name in one class then it is called method overloading 
//
//polymorphism means many forms and it have two types 
//1. method overloading( compile/static polymorphism)
//2. method overriding (run/dynamic polymorphism)
//
//dynamic polymorphism is part of inheritance
//
//in this we explained about method overloading

////////////////////////////////////////////////////////

// method overriding
//when we use same method name and same parameter in two different class with different implementation or their own logic 
//this phenomena is called method overriding
//and this is part of inheritance because we are using extends keyword to use parrent class properties in chid class