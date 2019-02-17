
/*

6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique
employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]


*/

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {

		int number, guess;
		int playAgain;
		Scanner input = new Scanner(System.in);

		SecureRandom random = new SecureRandom();

		// i jap vlere random numrit qe useri duhet te gjeje
		number = 1 + random.nextInt(1000);

		System.out.println("Enter your  guess : ");
		guess = input.nextInt();

		// nese e gjen me input te pare
		if (guess == number) {
			System.out.println("Congratulations");
			System.out.println("Press 1 if you want to play again, or any other number to exit");
			playAgain = input.nextInt();
			if (playAgain == 1)
				number = -999;
			; // i japim nje vlere te ndryshme nga cdo numer nga 1 deri 1000, qe cikli while
				// te ekzekutohet
			// nese fut numer tjeter, cikli nuk do te ekzekutohet, pasi ghuess == numer
		}

		while (number != guess) {
			if (guess > number)
				System.out.println("Too high.");
			else if (guess < number)
				System.out.println("Too Low");

			System.out.println("Enter your next guess : ");
			guess = input.nextInt();

			if (guess == number) { // nese e gjen numrin, pyesim nese do luaj perseri , nese po
									// ndeyshojme numrin qe duhet te gjeje dhe pyesim per guessin
			}
			System.out.println("Congratulations");
			System.out.println("Press 1 if you want to play again, or any other number to exit");
			playAgain = input.nextInt();
			if (playAgain == 1) {
				number = 1 + random.nextInt(1000); // i japim nje vlere te ndryshme nga cdo numer nga 1 deri 1000
				System.out.println("Enter your next guess : ");
				guess = input.nextInt();

			} else
				break;

		}
	}

}
