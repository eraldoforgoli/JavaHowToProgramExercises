
/*

6.36 (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environments
is student fatigue. This can be reduced by varying the computer’s responses to hold the student’s
attention. Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.


do perdor dy metoda, returnPositiveMessage()  dhe returnNegativeMessage(), qe do te kthej nje string me mesazh per cdo rast
brenda ketyre metodave do perdoret nje vektor me stringjet me siper, dhe do perdoret nje RandomGenerator per te zgjedhur nje string random





*/

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue { //
	private static SecureRandom random = new SecureRandom();
	private static int nr1, nr2;

	public static void main(String[] args) {
		int answer;
		Scanner input = new Scanner(System.in);

		generateQuestion();
		answer = input.nextInt();
		if (checkAnswer(answer)) {
			System.out.println(returnPositiveMessage());
			generateQuestion();
			answer = input.nextInt();

			if (checkAnswer(answer)) {
				while (checkAnswer(answer)) {
					System.out.println(returnPositiveMessage());
					generateQuestion();
					answer = input.nextInt();

					if (!checkAnswer(answer)) {
						while (!checkAnswer(answer)) {
							System.out.println(returnNegativeMessage());
							answer = input.nextInt();
							if (checkAnswer(answer)) {
								System.out.println(returnPositiveMessage() + " program ended.");
								break;
							}
						}
					}
					if (checkAnswer(answer)) {
						break;
					}
				}
			} else {
				while (!checkAnswer(answer)) {
					System.out.println(returnNegativeMessage());
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println(returnPositiveMessage() + " program ended.");
					}
				}
			}
		}

		else {
			System.out.println(returnNegativeMessage());
			answer = input.nextInt();
			if (!checkAnswer(answer)) {
				while (!checkAnswer(answer)) {

					System.out.println(returnNegativeMessage());
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println(returnPositiveMessage() + " program ended.");
					}
				}
			} else {
				System.out.println(returnPositiveMessage() + " program ended.");
			}
		}
		input.close();
	}

	public static void generateQuestion() {
		nr1 = 1 + random.nextInt(9);
		nr2 = 1 + random.nextInt(9);
		System.out.printf("How much is %d times %d?%n  ", nr1, nr2);
	}

	public static boolean checkAnswer(int answer) {
		if (answer == nr1 * nr2)
			return true;
		return false;
	}

	public static String returnPositiveMessage() {
		String[] message = { "Very good!", "Excellent!", "Nice work!", "Keep up the good work!" };
		return message[random.nextInt(4)]; // kthen nje string nga vektori, dmth nga indekti 0 ne 3
	}

	public static String returnNegativeMessage() {
		String[] message = { "Very good!", "No. Please try again.", "Wrong. Try once more.", "Don't give up!",
				"No. Keep trying." };

		return message[random.nextInt(4)]; // kthen nje string nga vektori, dmth nga indekti 0 ne 3
	}
}
