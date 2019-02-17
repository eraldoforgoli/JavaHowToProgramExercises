
/*

4.37 (Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”)
and is defined as follows:
	n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
	and
	n! = 1 (for n = 0)
	For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
	a) Write an application that reads a nonnegative integer and computes and prints its factorial.
	b) Write an application that estimates the value of the mathematical constant e by using
	the following formula. Allow the user to enter the number of terms to calculate.
	c) Write an application that computes the value of ex by using the following formula. Allow
	the user to enter the number of terms to calculate.
	
	*/

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		int number, exponent;
		double e = 1.0; // inicializoj me 1
		double power = 1.0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the factorial");
		number = input.nextInt();
		System.out.printf("%d!= %d%n", number, factorial(number));

		System.out.println("Enter the number of terms for the calculation of e-constant");
		number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			e += (double) 1.0 / factorial(i);

		}

		System.out.printf("Value of e by using %d terms if %.3f%n : ", number, e);

		System.out.println("Calculaton of e^x : ");
		System.out.println("Enter the exponent : ");
		exponent = input.nextInt();
		System.out.println("Enter the number of terms: ");
		number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			power += Math.pow(exponent, i) / factorial(i);

		}

		System.out.printf("e ^ %d = %f", exponent, power);

		input.close(); // mbyll Scannerin

	}

	public static int factorial(int number) { // do ta therrasim funksionin per te llogaritur faktorialin ne kerkesat b
												// dhe c (me rekursion)

		if (number == 1)
			return 1;

		else
			return number * factorial(number - 1);

	}
}
