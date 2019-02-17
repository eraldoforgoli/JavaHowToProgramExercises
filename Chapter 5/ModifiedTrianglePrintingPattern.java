
/*
 
 
5.22 (Modified Triangle Printing Program) Modify Exercise 5.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side. [Hint: Make clever
use of nested for loops.]
		

*/

public class ModifiedTrianglePrintingPattern {
	public static void main(String[] args) {
	
	
	int n = 10;
	
	for(int i = 1; i <= 10; i++) {
		for(int j = 1; j <=i; j++ ) 
			System.out.print('*');
		
		System.out.print(" ");
		for(int j = 1; j <= i-1; j++ ) 
			System.out.print(' ');
		
		for(int j = 1; j <= n-i+1; j++)
			System.out.print("*");
	
		System.out.print(" ");
		
		
		for(int j = 1; j <= n-i + 1; j++ ) 
			System.out.print('*');
			
		System.out.print(" ");
		
		
			for(int j = 1; j <= n-i + 1; j++ ) 
				System.out.print(' ');
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	
	

	
	
	
	
	
	}
	

}
