
/*

6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter
side. For example, if side is 4, the method should display

****
****
****
****

*/

import java.util.Scanner;

public class DisplayingASquareOfAsterics {
	public static void main(String[] args) {

		int numberOfRows;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		numberOfRows = input.nextInt();

		squareOfAstrics(numberOfRows);

		input.close(); // mbyll Scannerin
	}

	public static void squareOfAstrics(int nr) {

		for (int i = 0; i < nr; i++) { // per cdo rrjesht bej: 
			for (int j = 0; j < nr; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
