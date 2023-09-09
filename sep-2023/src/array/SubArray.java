package array;

public class SubArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			String s = "";
			for (int j = i; j < arr.length; j++) {
				s += arr[j] + " ";
				System.out.println(s);
			}

		}
	}

}
