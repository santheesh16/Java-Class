package Basic_Pgm_Java;

import java.util.Scanner;

public class Conditional_Statement {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Conditional Statement");
		System.out.println("Using if");
		if(a > 100) {
			System.out.println(a+5);
		}
		if(a < 100) {
			System.out.println(a-5);
		}
		System.out.println("Using if..else");
		if(a >100) {
			System.out.println( a+5);
			count = 1;
		}else {
			System.out.println(a-5);
			count = 2;
		}
		System.out.println("Using else..if");
		if(a > 100) {
			System.out.println(a+5);
		} else if(a < 100){
			System.out.println(a-5);
		} 
		System.out.println("Using Switch Case");
		switch (count) {
		case 1: {
			System.out.println(a+5);
			break;
		}
		case 2:
			System.out.println(a-5);
			break;
		}

	}

}
