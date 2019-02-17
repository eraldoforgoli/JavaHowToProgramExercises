
/*

6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. 


*/

import java.util.Scanner;

public class Multiplies {
	public static void main(String[] args) {
		int n1, n2;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		n1 = input.nextInt();
		n2 = input.nextInt();

		System.out.printf("Is %s multiple", isMultiple(n1, n2) ? "" : "not");

		input.close();
	}

	public static boolean isMultiple(int a, int b) {
		if (b % a == 0)
			return true;
		return false;
	}
}
