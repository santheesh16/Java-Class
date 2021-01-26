package Basic_Pgm_Java;

//2.Solve Quadratic equation input a= 1, b=5 ,c =3 (Using if, else if and if else)

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a:");
		double num1 = scan.nextDouble();
		System.out.println("Enter the value b:");
		double num2 = scan.nextDouble();
		System.out.println("Enter the value c:");
		double num3 = scan.nextDouble();

		double deter = num2 * num2 - 4 * num1 * num3;
		double root1, root2;
		
		//Another way of approach
		
		
		
		if (deter  == 0) {
			root1 = root2 = -num2 / (2 * num1);
			System.out.println("The Roots are"+ root1);
		} else if(deter > 0) {
			root1 = (-num2 + Math.sqrt(deter)) / (2 * num1);
			root2 = (+num2 + Math.sqrt(deter)) / (2 * num1);
			System.out.println("The Roots are" + root1 + "," + root2);
		} else {
			System.out.println("The Roots are imaginary" );
		}
		
		
		System.out.println("Using if");
		if (deter >= 0) {
			if (deter > 0) {
				root1 = (-num2 + Math.sqrt(deter)) / (2 * num1);
				root2 = (+num2 + Math.sqrt(deter)) / (2 * num1);
				System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
			} 
			if(deter == 0){
				root1 = root2 = -num2 / (2 * num1);
				System.out.printf("root1 = root2 = %.2f;", root1);
			}
		}
		if (deter < 0) {
			double real = -num2 / (2 * num1);
			double imaginary = Math.sqrt(-deter) / (2 * num1);
			System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
			System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		
		
		System.out.println("\nUsing if..else");
		if (deter >= 0) {
			if (deter > 0) {
				root1 = (-num2 + Math.sqrt(deter)) / (2 * num1);
				root2 = (+num2 + Math.sqrt(deter)) / (2 * num1);
				System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
			} else {
				root1 = root2 = -num2 / (2 * num1);
				System.out.printf("root1 = root2 = %.2f;", root1);
			}
		} else {
			double real = -num2 / (2 * num1);
			double imaginary = Math.sqrt(-deter) / (2 * num1);
			System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
			System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		
		
		System.out.println("\nUsing else..if");
		if (deter > 0) {
			root1 = (-num2 + Math.sqrt(deter)) / (2 * num1);
			root2 = (+num2 + Math.sqrt(deter)) / (2 * num1);
			System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
		} else if (deter == 0) {
			root1 = root2 = -num2 / (2 * num1);
			System.out.printf("root1 = root2 = %.2f;", root1);
		} else {
			double real = -num2 / (2 * num1);
			double imaginary = Math.sqrt(-deter) / (2 * num1);
			System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
			System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}
}
