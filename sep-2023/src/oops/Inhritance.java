package oops;

public class Inhritance {
	public static void main(String[] args) {
		Father f= new Father();
		
		f.property();
		f.occupation();
		
		Son s= new Son();
		s.property();
		s.occupation();
	}

}

class Father {
	void occupation() {
		System.out.println("Bollywood hero ");
	}

	void property() {
		System.out.println("100 millions in bank account...");
	}
}

class Son extends Father {

	void occupation() {
		System.out.println("Hollywood hero ");
	}

}

//in this example we created parrent class / base class and chid class/ derived class /sub class
//ans using parrent property in chid class . here we are inheriting parrent class all properties in child class 
//that is inheritance in java 
