package mathsProblem;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		long n=6;
		long fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
