package mathsProblem;

public class EvenOrOdd {

	public static void main(String[] args) {

		int n = 7;
		int e = n & 1;

		if (e == 0) {
			System.out.println(n + " is even number ");
		} else {
			System.out.println(n + " is odd number ");
		}

	}

}
