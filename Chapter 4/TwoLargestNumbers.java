
/*
 4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]

*/

import java.util.Scanner;

public class TwoLargestNumbers {
	public static void main(String[] args) {
		int nr, max1 = -99999, max2 = -999999;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 numbers : ");

		for (int i = 1; i <= 10; i++) {
			nr = input.nextInt();
			if (nr >= max1) {
				max2 = max1;
				max1 = nr;
			}
		}
		System.out.println("Largest number " + max1 + "\n Second largest number : " + max2);
		input.close();
	}
}
