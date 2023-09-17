package recursion;

public class PrintNumberInIncreasingOrder {
	public static void main(String[] args) {
		int n= 10;
		
		int x=n;
		printNum(n);
		
	}

	static void printNum(int n) {
		
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		printNum(n-1);
		System.out.print(n+" ");
	}
}
