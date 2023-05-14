package implementation;

public class MaxFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 };
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			int c=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[i]) {
					c++;
				}
			}
			if(c>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
