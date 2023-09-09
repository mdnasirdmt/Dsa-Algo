package array;

public class PairsOfElements {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7 };
		pairs(arr);
	}

	private static void pairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String s = "";
			for (int j = i + 1; j < arr.length; j++) {
				s += "(" + arr[i] + "," + arr[j] + ")";
			}
			System.out.println(s);
		}
	}

}
