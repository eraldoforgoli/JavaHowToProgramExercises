
/*

4.35 (Sides of a Triangle) Write an application that reads three nonzero values entered by the
user and determines and prints whether they could represent the sides of a triangle.


*/
import java.util.Scanner;

public class SidesOfATriangle {
	public static void main(String[] args) {

		int a, b, c;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 values that represent the sides of a triangle: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		// shuma e cdo dy brinjeve ne nje trekendesh eshte me e madhe se brinja e trete

		if (a + b > c && a + c > b && b + c > a)
			System.out.println("Yes, these values represent the sides of a triangle");

		else
			System.out.println("No, these values represent the sides of a triangle");

		input.close(); // mbyll Scannerin

	}
}
