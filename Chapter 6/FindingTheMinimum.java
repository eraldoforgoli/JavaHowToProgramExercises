
/*
 
6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint
numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the result.

*/

import java.util.Scanner;

public class FindingTheMinimum {
	public static void main(String[] args) {

		double n1, n2, n3;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 floating point numbers : ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		
		System.out.println("Minumum : " + minimum3(n1, n2, n3));

	}

	public static double minimum3(double n1, double n2, double n3) {

		return Math.min(n1, Math.min(n2, n3));

	}

}
