
/*
4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
System.out.print("* ");
System.out.print(" ");
System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no arguments
causes the program to output a single newline character. [Hint: Repetition statements are
required.]
		
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *

	*/

import java.util.Scanner;

public class CheckerboardPatter {
	public static void main(String[] args) {

		int nr;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of rows :");
		nr = input.nextInt();

		for (int i = 0; i < nr; i++) { // per cdo rrjesht
			if (i % 2 == 1) // rrjeshtat tek nisin me hapesire
				System.out.print(" ");
			for (int j = 0; j < nr; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		input.close(); // mbyll Scannerin
	}
}
