
/*

6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.

*/

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {

		int radius;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius :");
		radius = input.nextInt();
		
		System.out.println("Area : " + circleArea(radius));

		input.close();

	}

	public static double circleArea(int r) {
		return Math.PI * Math.pow(r, 2);
	}

}
