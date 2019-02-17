
/* 4.30  (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter
a new value.


*/

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter the number : ");
		number = input.nextInt();

		String palindrome = Integer.toString(number);

		if (palindrome.length() != 5) {
			System.out.println("Enter a new Number : ");
			number = input.nextInt();
			palindrome = Integer.toString(number);
		}

		if (kthePalindrome(palindrome)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Jo palindrome");
	}

	public static boolean kthePalindrome(String palindrome) {

		for (int i = 0; i < palindrome.length() / 2; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i))
				return false;
		}
		return true;
	}
}