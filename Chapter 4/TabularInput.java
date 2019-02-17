/*
4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
values:
	
	N 10*N 100*N 1000*N
	1 10 100 1000
	2 20 200 2000
	3 30 300 3000
	4 40 400 4000
	5 50 500 5000
	
	*/

public class TabularInput {
	public static void main(String[] args) {
		System.out.println("N \t 10*N \t 100*N \t 100*N");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\t" + 10 * i + "\t" + 100 * i + "\t" + 1000 * i);
		}
	}
}
