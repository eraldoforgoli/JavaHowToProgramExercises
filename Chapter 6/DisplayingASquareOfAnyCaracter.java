
/*

6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive
a second parameter of type char called fillCharacter. Form the square using the char provided
as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
#####
#####
#####
#####
#####

*/

import java.util.Scanner;

public class DisplayingASquareOfAnyCaracter {
	public static void main(String[] args) {

		int numberOfRows;
		char printChar;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		numberOfRows = input.nextInt();

		System.out.println("Enter the character to be printed");
		printChar = input.next().charAt(0);
		
		
		squareOfAstrics(numberOfRows, printChar);

		input.close(); // mbyll Scannerin
	}

	public static void squareOfAstrics(int nr, char c) {

		for (int i = 0; i < nr; i++) { // per cdo rrjesht bej:
			for (int j = 0; j < nr; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
