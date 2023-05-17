package general;

import java.util.Arrays;

public class CloningAObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		Persion originalPersion = (Persion) new Persion("Nasir", new Address("Patna"));

		Persion clonePersion = (Persion) originalPersion.clone();
		clonePersion.setName("Hussain");
		clonePersion.getAddress().setCity("Madhepura");

		System.out.println(originalPersion);
		System.out.println(clonePersion);

	}

}

class Persion implements Cloneable {

	String name;
	Address address;

	Persion(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return (Persion) super.clone();
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", address=" + address + "]";
	}

}

class Address implements Cloneable {
	String city;

	public Address(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}