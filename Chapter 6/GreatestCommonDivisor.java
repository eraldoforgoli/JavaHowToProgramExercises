
/*

6.27 (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid�s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
into an application that reads two values from the user and displays the result.


*/

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int n1, n2;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers : ");
		n1 = input.nextInt();
		n2 = input.nextInt();

		System.out.println("Greatest common divisor is : " + greatestCommonDivisor(n1, n2));
		input.close();
	}

	public static int greatestCommonDivisor(int n1, int n2) {
		if (n2 == 0)
			return n1;

		return greatestCommonDivisor(n2, n1 % n2);
	}
}
