package array;

public class SubArrays {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				String s= "";
				for(int k=i; k<=j; k++) {
					s+=arr[k]+" ";
				}
				System.out.println(s);
			}
		}
	}

}
