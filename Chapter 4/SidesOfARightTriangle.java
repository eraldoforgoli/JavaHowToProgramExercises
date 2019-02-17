
/*

4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
and prints whether they could represent the sides of a right triangle.

*/
import java.util.Scanner;

public class SidesOfARightTriangle {
	public static void main(String[] args) {
		int a, b, c, katet1, katet2, hipotenuze;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 values that represent the sides of a triangle: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		katet1 = a;
		katet2 = b;
		hipotenuze = c;

		if (a >= b && a >= c) {
			hipotenuze = a;
			katet1 = b;
			katet2 = c;
		}

		if (b >= a && b >= c) {
			hipotenuze = b;
			katet1 = a;
			katet2 = c;
		}

		if (c >= b && c >= a) {
			hipotenuze = c;
			katet1 = b;
			katet2 = a;
		}

		/*
		 * apply pythagorean theorem
		 */
		if (Math.pow(katet1, 2) + Math.pow(katet2, 2) == Math.pow(hipotenuze, 2))
			System.out.println("Yes, these values represent the sides of a right triangle");

		else
			System.out.println("No, these values represent the sides of a right triangle");
		input.close();
	}
}
