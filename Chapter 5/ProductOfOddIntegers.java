/*

5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
of the odd integers from 1 to 15.

*/

public class ProductOfOddIntegers {
	public static void main(String[] args) {

		int product = 1, i;

		for (i = 1; i <= 15; i += 2) {
			product *= i;
		}

		System.out.println("Product: " + product);

	}
}
