package two_d_array;

import java.util.Scanner;

public class LargestIn2d {
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
		largest(matrix);
	}
	
	static void largest(int[][] mat) {
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if(mat[i][j] > max) {
					max= mat[i][j];
				}
			}
		}
		System.out.println("largest in matrix is "+ max);
	}

}
