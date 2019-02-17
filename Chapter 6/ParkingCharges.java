
/*

6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
the charge for each customer.


*/

import java.util.Scanner;

public class ParkingCharges {
	public static void main(String[] args) {

		int numberOfCustomers, hoursParked;
		double charge, totalCharge = 0.0;
		;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of customers:");
		numberOfCustomers = input.nextInt();

		for (int i = 0; i < numberOfCustomers; i++) {
			System.out.println("Enter the hours parked for customer : " + (i + 1));
			hoursParked = input.nextInt();
			
			System.out.println("Customer 1 is charged : " + calculateCharges(hoursParked) + "$");
			totalCharge += calculateCharges(hoursParked);
			
		}
		
		System.out.println("Total charge : " + totalCharge);

	}

	public static double calculateCharges(int hours) {
		if (hours > 3.0) 
			return 3.0 * 2.00 + ((double) hours - 3.0) * 0.50;
	    else
			return (double) hours * 2.0;

	}
}
