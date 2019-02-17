
/*

6.35 (Computer-Assisted Instruction) The use of computers in education is referred to as computer-
assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question.
This method should be called once when the application begins execution and each time the
user answers the question correctly.



*/

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
	private static SecureRandom random = new SecureRandom();
	private static int nr1, nr2;

	public static void main(String[] args) {
		int answer;

		Scanner input = new Scanner(System.in);

		generateQuestion();
		answer = input.nextInt();

		if (checkAnswer(answer)) {
			System.out.println("Very Good ");
			generateQuestion();
			answer = input.nextInt();
			if (checkAnswer(answer)) {
				while (checkAnswer(answer)) {
					System.out.println("Very Good ");
					generateQuestion();
					answer = input.nextInt();
					if (!checkAnswer(answer)) {
						while (!checkAnswer(answer)) {
							System.out.println("Try again");
							answer = input.nextInt();
							if (checkAnswer(answer)) {
								System.out.println("Very Good, program ended.");
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
					System.out.println("Try again");
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println("Very Good, program ended.");
					}
				}
			}
		}

		else {
			System.out.println("Try again");
			answer = input.nextInt();
			if (!checkAnswer(answer)) {
				while (!checkAnswer(answer)) {

					System.out.println("Try again");
					answer = input.nextInt();
					if (checkAnswer(answer)) {
						System.out.println("Very Good, program ended.");
					}
				}
			} else {
				System.out.println("Very Good, program ended.");
			}
		}
	}

	public static void generateQuestion() {
		nr1 = 1 + random.nextInt(9);
		nr2 = 1 + random.nextInt(9);
		System.out.printf("How much is %d times %d?%n  ", nr1, nr2);
	}

	public static boolean checkAnswer(int answer) { // kthen true kur pergjigja e nxenesit eshte e sakte
		if (answer == nr1 * nr2)
			return true;
		return false;
	}
}
