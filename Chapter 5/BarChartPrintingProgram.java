
/*

5.16 (Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example,
if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.

*/

import java.util.Scanner;

public class BarChartPrintingProgram {
	public static void main(String[] args) {
		int number1, number2, number3, number4, number5;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 5 numbers ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		number4 = input.nextInt();
		number5 = input.nextInt();

		for (int j = 0; j < number1; j++)
			System.out.print("*");

		System.out.println();

		for (int j = 0; j < number2; j++)
			System.out.print("*");

		System.out.println();

		for (int j = 0; j < number3; j++)
			System.out.print("*");

		System.out.println();

		for (int j = 0; j < number4; j++)
			System.out.print("*");

		System.out.println();

		for (int j = 0; j < number5; j++)
			System.out.print("*");

		System.out.println();
	}
}
