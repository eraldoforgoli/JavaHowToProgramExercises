
/*
4.38 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet
has asked you to write a program that will encrypt it so that it may be transmitted more securely.
All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
		
	
		
		*/

import java.util.Scanner;

public class MakingADifference {
	public static void main(String[] args) {

		int number, lastDigit, temp;
		int counter = 1;
		int incryptedNumber, decryptedNumber;
		int[] digits = new int[4]; // do perdor vektor per te futur secilen shifer te numrit
		int[] digits1 = new int[4];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4 digit integer ");
		number = input.nextInt();

		while (number > 0) {

			lastDigit = number % 10; // marr shifren e fundit te numrit
			lastDigit = (lastDigit + 7) % 10;
			digits[digits.length - counter] = lastDigit; // fut shifrat ne vektor, nga pozicioni i funid deri tek
															// pozicioni i pare i vektorit
			counter++;

			number /= 10; // heqim nga numri shifren e fundit

		}

		// shkembej shifren 1 me 3 dhe 2 me 4
		temp = digits[0];
		digits[0] = digits[2];
		digits[2] = temp;

		temp = digits[1];
		digits[1] = digits[3];
		digits[3] = temp;

		// konvertoj vektorin me int ne String, me pas ne variabel int
		char[] chars = new char[digits.length];
		for (int i = 0; i < digits.length; i++)

			chars[i] = (char) (digits[i] + '0'); // pasi nese do perdorja menyre tjeter per ti bere concatenate numrat
													// ne string, do humbisnin 0

		String s = new String(chars);
		incryptedNumber = Integer.parseInt(s);

		System.out.printf("The incrypted number is : %d%n ", incryptedNumber);

		System.out.println("Enter a number to decrypt :");

		number = input.nextInt();

		counter = 1; // ndryshohet vlera ne 1 pasi counteri esthe rritur tek kodi siper

		while (number > 0) {

			lastDigit = number % 10; // marr shifren e fundit te numrit
			lastDigit = lastDigit + 3; // pasi do i shtonim numrit 10, do i hiqnim 7 (10 - 7 = 3)
			digits1[digits.length - counter] = lastDigit; // fut shifrat ne vektor, nga pozicioni i funid deri tek
															// pozicioni i pare i vektorit
			counter++;

			number /= 10; // heq shifren e fundit

		}

		// shkembej shifren 1 me 3 dhe 2 me 4

		temp = digits1[0];
		digits1[0] = digits1[2];
		digits1[2] = temp;

		temp = digits1[1];
		digits1[1] = digits1[3];
		digits1[3] = temp;

		char[] chars1 = new char[digits.length];
		for (int i = 0; i < digits1.length; i++)

			chars1[i] = (char) (digits1[i] + '0'); // pasi nese do perdorja menyre tjeter per ti bere concatenate numrat
													// ne string, do humbisnin 0

		String s1 = new String(chars1);
		decryptedNumber = Integer.parseInt(s1);

		System.out.printf("The decrypted number is : %d ", decryptedNumber);

		// mbyll Scannerin
		input.close();

	}

}
