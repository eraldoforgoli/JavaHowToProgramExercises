/*
6.34 (Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.


*/
public class TableOfBinaryOctalHexadecimalNumbers {
	public static void main(String[] args) {

		int decimal;
		String binary, octal, hexadecimal;

		System.out.println("Decimal  | Binary | Octal | Hexadecimal ");

		for (int i = 1; i <= 256; i++) {

			decimal = i;
			binary = octal = hexadecimal = "";
			int tmp;

			// konvertoj ne number binar
			while (decimal >= 2) {
				tmp = decimal % 2;
				binary += tmp;
				decimal /= 2;
			}

			binary = decimal + binary;
			decimal = i;

			// konvertim oktal
			while (decimal >= 2) {
				tmp = decimal % 2;
				octal += tmp;
				decimal /= 2;
			}

			octal += decimal;
			decimal = i;

			// konvertim hekzadecimal

			while (decimal >= 16) {
				tmp = decimal % 16;
				switch (tmp) {

				case 10:
					hexadecimal += "A";
					break;
				case 11:
					hexadecimal += "B";
					break;
				case 12:
					hexadecimal += "C";
					break;
				case 13:
					hexadecimal += "D";
					break;
				case 14:
					hexadecimal += "E";
					break;
				case 15:
					hexadecimal += "F";
					break;
				default:
					hexadecimal += tmp;
					break;

				}
				decimal /= 16;

			}
			hexadecimal += decimal;

			System.out.println(i + "         " + binary + "        " + octal + "         " + hexadecimal);

		}

	}

}
