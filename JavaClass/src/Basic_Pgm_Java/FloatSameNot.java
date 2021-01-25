package Basic_Pgm_Java;


//3.Write the program that reads to two float points numbers and test whether they are same or not(Using Any condition)
import java.util.Scanner;

public class FloatSameNot {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		System.out.println("Using if..else");
		if(num1 == num2) {
			System.out.println("The Given two number are same");
		}else {
			System.out.println("The Given two number are not same");
		}
		System.out.println("Using else..if");
		if(num1 == num2) {
			System.out.println("The Given two number are same");
		}else if(num1 != num2){
			System.out.println("The Given two number are not same");
		}
	}
}
