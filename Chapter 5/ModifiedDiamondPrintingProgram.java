
/*

5.25 (Modified Diamond Printing Program) Modify the application you wrote in Exercise 5.24
to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your
program should then display a diamond of the appropriate size.


 */

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
	public static void main(String[] args) {

		int rrjesht;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of rows :");
		rrjesht = input.nextInt();

		for (int i = 1; i <= rrjesht; i++) { // per cdo rrjesht bej:
			for (int j = 1; j <= rrjesht - i; j++) // per cdo dikel i, bej: 
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++) // per cdo dikel i, bej: 
				System.out.print("*");

			System.out.println(); // kalo ne rrjesht te ri
		}

		//pjesa siper 
		for (int i = 1; i <= rrjesht; i++) { // per cdo rrjesht bej:
			for (int j = 1; j <= i; j++) // per cdo dikel i, bej: 
				System.out.print(" ");

			for (int j = 1; j <= 2 * rrjesht - 2 * i - 1; j++)
				System.out.print("*");

			System.out.println(); // kalo ne rrjesht te ri

		}

	}

}
