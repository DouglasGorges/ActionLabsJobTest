package application;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 != 0) {
				System.out.println("Fizz");
			}
			else if (num % 5 == 0 && num % 3 != 0) {
				System.out.println("Buzz");
			}
			else if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(num);
			}
		}
	}
}