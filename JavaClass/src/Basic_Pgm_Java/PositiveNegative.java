package Basic_Pgm_Java;


//1.Write the program to get a number from the user print the number is positive or negative
import java.util.Scanner;

@SuppressWarnings("resource")
public class PositiveNegative {
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Using if..else");
		if (num > 0) {
			System.out.println("The Given is Positive");
			count = 1;
		} else {
			System.out.println("The Given is Negative");
			count = 2;
		}
		System.out.println("Using else..if");
		if (num > 0) {
			System.out.println("The Given is Positive");
		} else if (num < 0) {
			System.out.println("The Given is Negative");
		} else {
			System.out.println("The Given is Zero");
		}
		System.out.println("Using Switch Case");
		switch (count) {
		case 1: {
			System.out.println("The Given is Positive");
			break;
		}
		case 2:
			System.out.println("The Given is Negative");
			break;
		}
	}
}
