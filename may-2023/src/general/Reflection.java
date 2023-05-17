package general;

import java.lang.reflect.Field;

public class Reflection {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Persion1 persion = new Persion1("Nasir", 27);

		System.out.println(persion);

		Class<Persion1> persionC = Persion1.class;

		Field nameField = persionC.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(persion, "Hussain");
		String str = (String) nameField.get(persion);

		System.out.println("Name: "+str);

		// Modify the private field "age" using reflection
		Field ageField = persionC.getDeclaredField("age");

		ageField.setAccessible(true);

		ageField.setInt(persion, 30);
		int age = (int) ageField.get(persion);
		System.out.println("Age: " + age);

	}

}

class Persion1 {
	private String name;
	private int age;

	public Persion1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", age=" + age + "]";
	}

}


/*
 * In this example, we have a Person class with private fields name and age.
 * Through reflection, we are able to access and modify these private fields at
 * runtime.
 * 
 * First, we obtain the Class object for the Person class using Person.class.
 * Then, we use getDeclaredField() method of Class to get a reference to the
 * private field name and age. By calling setAccessible(true), we make these
 * fields accessible even though they are private.
 * 
 * Next, we retrieve the value of the private field name using
 * nameField.get(person). Similarly, we modify the value of the private field
 * age using ageField.setInt(person, 30).
 * 
 * Finally, we print the retrieved values to the console. This demonstrates how
 * reflection allows us to examine and modify the private fields of a class at
 * runtime, which would otherwise not be directly accessible.
 */