package two_d_array;

import java.util.Scanner;

public class creation2dArray {
	public static void main(String[] args) {
		int row= 3;
		int col= 3;
		
		int[][] matrix = new int[row][col];
		Scanner sc = new Scanner(System.in);

		System.out.println("enter matrix values ");
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("matrix values are as follows :");
		for(int i= 0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
