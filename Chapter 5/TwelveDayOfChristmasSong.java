/*

5.29 (“The Twelve Days of Christmas” Song) Write an application that uses repetition and
switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.


[Verse 1]
On the first day of christmas my true love sent to me
A partridge in a pear tree

[Verse 2]
On the second day of christmas my true love sent to me
Two turtle doves, and
A partridge in a pear tree

[Verse 3]
On the third day of christmas my true love sent to me
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 4]
On the fourth day of christmas my true love sent to me
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 5]
On the fifth day of christmas my true love sent to me
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree
 

[Verse 6]
On the sixth day of christmas my true love sent to me
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 7]
On the seventh day of christmas my true love sent to me
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 8]
On the eighth day of christmas my true love sent to me
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree
 

[Verse 9]
On the nineth day of christmas my true love sent to me
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 10]
On the tenth day of christmas my true love sent to me
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 11]
On the eleventh day of christmas my true love sent to me
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

[Verse 12]
On the twelth day of christmas my true love sent to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five gold rings
Four colly birds
Three french hens
Two turtle doves, and
A partridge in a pear tree

*/

public class TwelveDayOfChristmasSong {
	public static void main(String[] args) {
		String day = "";

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				day = "first";
				break;
			case 2:
				day = "second";
				break;
			case 3:
				day = "third";
				break;
			case 4:
				day = "fourth";
				break;

			case 5:
				day = "fifth";
				break;
			case 6:
				day = "sixth";
				break;
			case 7:
				day = "seventh";
				break;

			case 8:
				day = "eighth";
				break;
			case 9:
				day = "nineth";
				break;
			case 10:
				day = "tenth";
				break;

			case 11:
				day = "eleventh";
				break;
			default:
				day = "twelth";
				break;

			}

			System.out.println("On the " + day + " day of christmas my true love sent to me");

			/*
			 * Meqenese cdo strofe i shtohet cdo fjali e strofes paraardhese, plus nje
			 * fjali, perdorim pozicionin e strofes per te printuar nga 1 deri tek numri i
			 * vargut (ne kete rast deri ne i tek cikli i jashtem) Do behet ciklim i kundert
			 * (cikli i brendshem) pasi vargjet nisin nga numri i strofes deri tek vargu i
			 * pare (per cdo strofe)
			 * 
			 */
			for (int j = i; j >= 1; j--) {
				switch (j) {
				case 1:
					System.out.println("A partridge in a pear tree");
					break;
				case 2:
					System.out.println("Two turtle doves, and");
					break;
				case 3:
					System.out.println("Three french hens");
					break;
				case 4:
					System.out.println("Four colly birds");
					break;

				case 5:
					System.out.println("Five gold rings");
					break;
				case 6:
					System.out.println("Six geese a-laying");
					break;
				case 7:
					System.out.println("Seven swans a-swimming");
					break;

				case 8:
					System.out.println("Eight maids a-milking");
					break;
				case 9:
					System.out.println("Nine ladies dancing");
					break;
				case 10:
					System.out.println("Ten lords a-leaping");
					break;

				case 11:
					System.out.println("Eleven pipers piping");
					break;
				default:
					System.out.println("Twelve drummers drumming");
					break;s
				}
			}
			System.out.println();
		}
	}
}
