package mathsProblem;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n= 4;
		int p= n & 0;
		System.out.println(p);
		if(p==0) {
			System.out.println("not prime ");
		}else {
			System.out.println("prime");
		}

	}

}
