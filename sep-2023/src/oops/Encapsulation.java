package oops;

import java.util.Arrays;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student s1= new Student("Md Nasir Hussain", 786, 95.5);

		System.out.println(s1);

	}

}

class Student {
	private String name;
	private int roll;
	private double percentage;

	public Student() {

	}

	public Student(String name, int roll, double percentage) {
		this.name = name;
		this.roll = roll;
		this.percentage = percentage;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return this.roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", percentage=" + percentage + "]";
	}

	

}

//in this we created a student class and defined some variable that are private 
//to set value created setter methode and to get value created getter methode and both methods are public toString is optional.
//that phenomena is called Encapsulation in java.
