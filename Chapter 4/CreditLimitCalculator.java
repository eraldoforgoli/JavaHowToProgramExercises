
/*

4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.

The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
the message "Credit limit exceeded".
*/

import java.util.Scanner;

public class CreditLimitCalculator {
	public static void main(String[] args) {
		int accountNumber, itemsCharged, numberOfCustomers, initialBalance, creditsApplied, allowedCredit, newBalance;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of customers : ");
		numberOfCustomers = input.nextInt();

		for (int i = 0; i < numberOfCustomers; i++) {

			System.out.println("Enter account number");
			accountNumber = input.nextInt();

			System.out.println("Enter initial balance : ");
			initialBalance = input.nextInt();

			System.out.println("Enter the number of charged items : ");
			itemsCharged = input.nextInt();

			System.out.println("Enter the number of the applied credits");
			creditsApplied = input.nextInt();

			System.out.println("Enter the allowed credit limit : ");
			allowedCredit = input.nextInt();

			newBalance = initialBalance + itemsCharged - creditsApplied;

			System.out.println("The new balance is : " + newBalance);

			if (newBalance > allowedCredit)
				System.out.println("Credit limit exceeded");
		}
		input.close();
	}
}
