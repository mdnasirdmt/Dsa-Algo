package string;

public class BalancePranthesis {

	public static void main(String[] args) {
		String s="((()))";
//		String s="((())))";
//		String s=")))(((";
		
		if(balaced(s)) {
			System.out.println("Balanced !");
		}else {
			System.out.println("Not Balanced !");
		}

	}

	private static boolean balaced(String s) {
		int c=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				c++;
			}else {
				c--;
			}
			
			if(c<0)
				return false;
		}
		if (c==0)
			return true;
		return false;
	}

}
