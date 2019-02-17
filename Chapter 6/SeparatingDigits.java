
/*
 
 
6.21 (Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer b.
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and calls display-
Digits by passing the method the integer entered. Display the results.


*/

import java.util.Scanner;

public class SeparatingDigits {
	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integer : ");
		a = input.nextInt();
		if (a >= 1 && a <= 99999)
			displayDigits(a);
		else
			System.out.print("Number should be 1 - 9999");

		input.close();
	}

	public static void displayDigits(int a) {
		int divisor = 1;
		int digit;

		for (int i = 1; i < a; i *= 10)
			divisor = i;
		while (divisor >= 1) {
			digit = integerPart(a, divisor);
			System.out.print(digit + " ");
			a = integerRemainder(a, divisor);
			divisor = integerPart(divisor, 10);
		}
	}

	public static int integerPart(int a, int b) {
		return (int) a / b;
	}

	public static int integerRemainder(int a, int b) {
		return (int) a % b;
	}
}
