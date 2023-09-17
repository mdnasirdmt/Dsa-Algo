package recursion;

public class SumOfNatural {
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(sumofNatural(n));
	}

	private static int sumofNatural(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+ sumofNatural(n-1);
	}

}
