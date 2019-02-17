
/*
 4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
 three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information
for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.


*/

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {

		int hoursWorked;
		double hourlyRate, grossPay;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter the hours worked by employee  " + i);
			hoursWorked = input.nextInt();

			System.out.println("Enter the hourly rate for employee  " + i);
			hourlyRate = input.nextDouble();

			if (hoursWorked > 40)
				grossPay = 40 * hourlyRate + (hoursWorked - 40) * (double) 1.5 * hourlyRate;

			else
				grossPay = 40 * hourlyRate;

			System.out.printf("Gross pay for employee %d is : %.2f%n ", i, grossPay);

		}
		
		input.close();

	}

}
