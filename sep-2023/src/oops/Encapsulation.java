package oops;

import java.util.Arrays;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student s1= new Student("Md Nasir Hussain", 786, 95.5);
		System.out.println(s1);
		
		Student s2= new Student();
		s2.setName("Shahrukh Khan");
		s2.setRoll(533);
		s2.setPercentage(96);
		System.out.println(s2);
		
		System.out.println("Name : "+s2.getName() + " \n"+ "Roll : "+ s2.getRoll()+ " \n"+ "Percentage : "+s2.getPercentage());
		

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
