/*

5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?


*/

public class CalculatingTheValueOfPI {
	public static void main(String[] args) {
		double Pi = 0;

		for (int i = 1; i <= 200000; i++) {
			if (i % 2 == 0)
				Pi -= 4.0 / (2 * i - 1);
			else
				Pi += 4.0 / (2 * i - 1);
		}
		System.out.printf("PI = %.3f", Pi);
	}
}
