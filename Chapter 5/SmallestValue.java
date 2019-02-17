
/*
5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.

*/

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		int nr, value, min;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of values");
		nr = input.nextInt();
		System.out.println("Enter the values:");
		min = input.nextInt();

		for (int i = 0; i < nr - 1; i++) {
			value = input.nextInt();
			if (value < min)
				min = value;
		}
		System.out.println("Minimum is : " + min);
		input.close();
	}
}
