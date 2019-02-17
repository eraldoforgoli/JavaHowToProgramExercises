/*

5.15 (Triangle Printing Program) Write an application that displays the following patterns separately,
one below the other. Use for loops to generate the patterns. All asterisks (*) should be printed
by a single statement of the form System.out.print('*'); which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
There should be no other output statements in the program. [Hint: The last two patterns require
that each line begin with an appropriate number of blank spaces.]
(a) (b)        (c)     (d)
* ********** ********** *
** ********* ********* **
*** ******** ******** ***
**** ******* ******* ****
***** ****** ****** *****
****** ***** ***** ******
******* **** **** *******
******** *** *** ********
********* ** ** *********
********** * * **********

*/
public class TrianglePrintingProgram {
	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(' ');

			for (int j = 1; j <= n - i + 1; j++)
				System.out.print("*");

			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
