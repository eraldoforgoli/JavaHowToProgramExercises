
/*
6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS).
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
	public enum Coin {
		HEADS, TAILS
	};

	public static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {

		int end = 0;

		Coin coin;
		int countHeads = 0, countTails = 0;

		Scanner input = new Scanner(System.in);

		while (end != 1) {

			if (flip() == Coin.HEADS) {
				countHeads++;
				System.out.println("HEAD");
			} else {
				countTails++;
				System.out.println("TAIL");

			}
			System.out.println("press  1 to end tossing  or any other button to continue ");
			end = input.nextInt();

		}

		System.out.println("Heads : " + countHeads + "\n Tails : " + countTails);

		input.close();
	}

	public static Coin flip() {
		if (random.nextInt(2) == 1) // ne baze te numrit random behet kthimi
			return Coin.TAILS;
		else
			return Coin.HEADS;
	}
}
