
/*

5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.


*/

import java.util.Scanner;

public class CalculatingSales {
	public static void main(String[] args) {
		int productNumber, quantity, close = 0;
		double retailProduct1 = 0.0, retailProduct2 = 0.0, retailProduct3 = 0.0, retailProduct4 = 0.0,
				retailProduct5 = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter -1 to stop buying ");

		while (close != -1) {
			System.out.println("Enter product number : ");
			productNumber = input.nextInt();

			System.out.println("Enter quantity sold ");
			quantity = input.nextInt();

			switch (productNumber) {
			case 1:
				retailProduct1 += quantity * 2.98;
				break;

			case 2:
				retailProduct2 += quantity * 4.50;
				break;

			case 3:
				retailProduct3 += quantity * 9.98;
				break;

			case 4:
				retailProduct4 += quantity * 4.49;
				break;

			case 5:
				retailProduct5 += quantity * 6.87;
				break;

			}
			System.out.println("Enter -1 to stop buying or any other button to continue  ");
			close = input.nextInt();
		}
		System.out.printf("Retail value  for product 1 : %.2f", retailProduct1);
		System.out.printf("Retail value  for product 2 : %.2f", retailProduct2);
		System.out.printf("Retail value  for product 3 : %.2f", retailProduct3);
		System.out.printf("Retail value  for product 4 : %.2f", retailProduct4);
		System.out.printf("Retail value  for product 5 : %.2f", retailProduct5);
	}
}
