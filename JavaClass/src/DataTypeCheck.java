
public class DataTypeCheck {
	public static void main(String[] args) {

		int num = 1;
		float dec = 0.345542382382648354459405837f;
		double decLong = 2.492748263923868246872397457485948594754785696796747694769847583019204739567934;
		long intLong = 459746989;

		int count = 10;
		for(int i = 0; i <count; ++i ) {
			System.out.println("The Given number");
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(dec);
		System.out.println(decLong);
		System.out.println(intLong);
	}
}
