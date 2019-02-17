
/*

5.32 (Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation fairer.
Check out the FairTax initiative in the United States at www.fairtax.org. Research how the proposed
FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
a 23% consumption tax on all products and services that you buy. Some FairTax opponents question
the 23% figure and say that because of the way the tax is calculated, it would be more accurate
to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
in various expense categories they have (e.g., housing, food, clothing, transportation, education,
health care, vacations), then prints the estimated FairTax that person would pay.

*/

import java.util.Scanner;

public class TheFairTax {
	public static void main(String[] args) {
		double totalExpenses = 0.0, tax;
		String[] categories = { "Housing", "Food", "Clothing", "Transportation", "Education", "Health Care",
				"Vacations" };
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < categories.length; i++) {
			System.out.println("Enter expenses for category : \n" + categories[i]);
			totalExpenses += input.nextDouble();
		}
		tax = (double) 23 / 100 * totalExpenses;
		System.out.printf("Tax is : %.2f", tax);

		input.close();
	}
}
