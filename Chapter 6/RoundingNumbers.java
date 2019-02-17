/*

6.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.


*/

import java.util.Scanner;

public class RoundingNumbers {
	public static void main(String[] args) {
		Double x;
		int y;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number to round :");
			x = input.nextDouble();
			y = (int) Math.floor(x + 0.5); // cast nga double ne int
			System.out.println("Original number : " + x + "  rounded number : " + y);
		}
		input.close();
	}
}
