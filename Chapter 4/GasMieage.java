
/*
4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.

*/

import java.util.Scanner;

public class GasMieage {
	public static void main(String[] args) {

		int miles, gallons, count = 0, totalMiles = 0, totalGallons = 0, sentinel = 0;
		Scanner in = new Scanner(System.in);

		while (sentinel != -1) {

			System.out.println("Enter the number of miles for trip " + (count + 1));
			miles = in.nextInt();

			System.out.println("Enter the gallons used for trip " + (count + 1));
			gallons = in.nextInt();

			totalMiles += miles;
			totalGallons += gallons;

			System.out.println("Miles/Gallon for trip " + (count + 1) + " = " + (double) miles / gallons);

			System.out.println("Enter -1 if you finished the trips or any other number to continue with other trips ");
			sentinel = in.nextInt();

			count++;
		}

		System.out.println("Miles/Gallon for all trips " + (count + 1) + " = " + (double) totalMiles / totalGallons);

		in.close(); // mbyll Scannerin
	}

}
