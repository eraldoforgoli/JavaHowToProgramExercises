
/*

6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
the method into an application that reads a value from the user and displays the result.

*/

import java.util.Scanner;

public class ReversingDigits {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = input.nextInt();
		System.out.print(reverse(number));

		input.close();

	}

	public static int reverse(int number) {
		String s = "";
		int n1;
		while (number >= 1) {
			n1 = number % 10;
			s += n1;
			number /= 10;
		}
		return Integer.parseInt(s);
	}
}
