
/*

(Diamond Printing Program) Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk (*), a single space or a single newline
character. Maximize your use of repetition (with nested for statements), and minimize the
number of output statements.


*/

public class DiamondPrintingProgram {
	public static void main(String[] args) {
		int m = 10;

		// upper half
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= m - i; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		// lower half
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * m - 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
