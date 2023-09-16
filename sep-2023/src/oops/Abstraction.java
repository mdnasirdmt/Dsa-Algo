package oops;

public class Abstraction {
	public static void main(String[] args) {

		Circle c = new Circle(5);
		System.out.println(c);

		System.out.println("area of circle : " + c.area());
		System.out.println("perimeter of circle : " + c.perimeter());
		c.displayInfo();

		System.out.println("\n///////////////////////////////////////////\n");

		Rectangle r = new Rectangle(5.1, 2.1);

		System.out.println(r);

		System.out.println("area of rectangle : " + r.area());
		System.out.println("perimeter of rectangle : " + r.perimeter());
		r.displayInfo();
	}

}

abstract class Shape {
	// Abstract method declarations
	abstract double area();

	abstract double perimeter();

	// Concrete method
	void displayInfo() {
		System.out.println("This is a shape.");
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

class Rectangle extends Shape {
	double width, height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}

//
//An abstract class in Java is a class that cannot be instantiated (meaning you cannot create objects directly from it),
//and it may contain a mix of both abstract and concrete (implemented) methods. 

//////////////////

//interface 
//interface is use to get 
//1. total abstraction 
//2. multiple inheritance 
//because in java 
//multiple inheritance is not supported with class level but it supported with interface level 
