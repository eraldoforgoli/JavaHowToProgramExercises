import java.util.Scanner;

/*

6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. The method should take an integer argument and return true if the integer
is even and false otherwise. Incorporate this method into an application that inputs a sequence
of integers (one at a time) and determines whether each is even or odd.


*/

public class EverOrOdd {
	public static void main(String[] args) {
		int n1;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < 10; i++) {
			n1 = input.nextInt();
			System.out.printf("Is %s Even%n", isEven(n1) ? "" : "not");
		}

		input.close();
	}

	private static boolean isEven(int n1) {
		if (n1 % 2 == 0)
			return true;
		return false;
	}
}
