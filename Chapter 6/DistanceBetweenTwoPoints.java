
/*

6.32 (Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
this method into an application that enables the user to enter the coordinates of the points.


*/

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
	public static void main(String[] args) {

		double x1, y1, x2, y2;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of first point :");
		x1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out.println("Enter the coordinates of second point :");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is : %.2f", x1, y1, x2, y2,
				distance(x1, y1, x2, y2));

	}

	public static double distance(double x1, double y1, double x2, double y2) {

		return Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

	}
}
