package Basic_Pgm_Java;

import java.util.Scanner;

public class ArrayMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = scan.nextInt();
		System.out.println("Enter the column value");
		int col = scan.nextInt();
		int[][] arr1 = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value of arr["+ i + "]["+ j + "]" + ":");
				arr1[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf(arr1[i][j] + " ");
			}
			System.out.println();
		}
		int leftDia = 0;
		int rightDia = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if( i == j) {
					leftDia += arr1[i][j];
				}
			}
			System.out.println();
		}
		System.out.printf("The sum of left diagonal " + leftDia );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(( i + j) == (row - 1 )) {
					rightDia += arr1[i][j];	
				}
			}
			System.out.println();
		}
		System.out.printf("The sum of left diagonal " + rightDia );
	}

}
