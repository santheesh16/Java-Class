package Basic_Pgm_Java;

import java.util.Scanner;

public class PyramidSeries {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		int increment = 1;
		int num1 = scan.nextInt();
		for(int i = 1; i <= num1 ; ++i) {
			for(int j = 1; j <= i ; ++j) {
				System.out.print(increment + " ");
				++increment;
			}
			System.out.println();
		}
	}
}
