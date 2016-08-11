public class Fibonacci {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i < 21; i++) {
			num1 = num1 + num2;
			System.out.println(num1);
			num2 = num2 + num1;
			System.out.println(num2);
		}
	}

}
