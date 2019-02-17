
/*
4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1    239.99
2    129.75
3    99.95
4    350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.



*/

import java.util.Scanner;

public class SalesCommissionCalculator {
	public static void main(String[] args) {
		double[] values = { 239.99, 129.75, 99, 95, 350, 89 };
		double sales = 0.0;
		int itemNumber;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the item number");
		itemNumber = input.nextInt();
		while (itemNumber != -1) {

			sales += values[itemNumber - 1];
			System.out.println("Enter -1  to finisht  or continue by entering item number : ");
			itemNumber = input.nextInt();
		}
		System.out.printf("Salesperson's earnings for lost week are : %.2f", (200.0 + (double) 9 / 100 * sales));
		input.close();
	}
}
