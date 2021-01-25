package Basic_Pgm_Java;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("The Given is Positive");
			
		}else {
			System.out.println("The Given is Negative");
		}
		switch (count) {
		case 1: {
			System.out.println("The Given is Positive");
		}
		case 2:
			System.out.println("The Given is Negative");
		}
	}
}
