
/*

6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines and displays all the prime numbers
less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
you’ve found all the primes?
		
		
*/

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		number = input.nextInt();

		System.out.printf("%s Prime ! ", isPrime(number) ? "Is " : "Is not");

		System.out.println("Displaying first 100000 prime numbers");
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i)) {
				System.out.printf(i + " is Prime ! %n");

			}
		}
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				return false;

		return true;

	}
}
