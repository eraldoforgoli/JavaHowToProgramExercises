
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

		generateQuestion(); // afishoj pyetjen
		answer = input.nextInt(); // mar pergjigjen

		if (checkAnswer(answer)) { // nese pergjigja eshte e sakte , perdor cikel tjeter per te shfaqur pyetje

			System.out.println(returnPositiveMessage()); // perdor metoden qe kthen nje string me mesazh pozitiv per
															// nxenesin(per cdo printim ku nxenesi pergjigjet sakte)
			generateQuestion(); // gjeneroj pytejen
			answer = input.nextInt(); // mar pergjigjen

			if (checkAnswer(answer)) {
				while (checkAnswer(answer)) { // nese pergjigja eshte e sakte , perdor cikel tjeter per te shfaqur
												// pyetje

					System.out.println(returnPositiveMessage());
					generateQuestion(); // gjeneroj pytejen
					answer = input.nextInt(); // mar pergjigjen

					if (!checkAnswer(answer)) { // nese pergjigja eshte e gabuar, per dor vikel qe ekzekutohet deri sa
												// useri te gjej pergjigjen e sakte
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

			} else { // nese pergjigjet gabim, ciklojme derisa pergjigjet sakte
				while (!checkAnswer(answer)) {

					System.out.println(returnNegativeMessage());
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println(returnPositiveMessage() + " program ended.");
					}
				}

			}
		}

		else { // nese qe ne fillim pergjigjet gabim, ciklojme derisa pergjigjet sakte

			System.out.println(returnNegativeMessage());
			answer = input.nextInt();
			if (!checkAnswer(answer)) { // nese nuk pergjigjet sakte
				while (!checkAnswer(answer)) {

					System.out.println(returnNegativeMessage());
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println(returnPositiveMessage() + " program ended.");
					}
				}
			} else { // nese pergjigjet sakte, mbaron ekzekutimi
				System.out.println(returnPositiveMessage() + " program ended.");
			}

		}

	}

	public static void generateQuestion() {
		nr1 = 1 + random.nextInt(9); // numer random nga 1 ne 9
		nr2 = 1 + random.nextInt(9);

		System.out.printf("How much is %d times %d?%n  ", nr1, nr2);

	}

	public static boolean checkAnswer(int answer) { // kthen true kur pergjigja e nxenesit eshte e sakte
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
