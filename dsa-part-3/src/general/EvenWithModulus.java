package general;

public class EvenWithModulus {

	public static void main(String[] args) {

		int x = 7;
		boolean f = (x / 2) * 2 == x;
		if (f) {
			System.out.println("number is even - " + f);
		} else
			System.out.println("number is odd - " + !f);

	}

}
