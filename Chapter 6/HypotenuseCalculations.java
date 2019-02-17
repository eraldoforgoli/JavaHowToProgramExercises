/*

6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two arguments
of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse method.

*/

import java.util.Scanner;

public class HypotenuseCalculations {
	public static void main(String[] args) {
		
		double katet1, katet2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter sides :");
		katet1 = input.nextDouble();
		katet2 = input.nextDouble();
		System.out.println("Hypotenuse : " + hypotenuse(katet1, katet2));
		
		
		input.close(); // mbyll Scannerin
	}
	
	public static double hypotenuse(double katet1, double katet2) {
		return  Math.sqrt( (Math.pow(katet1, 2) + Math.pow(katet2, 2) ));
		
	}

}
