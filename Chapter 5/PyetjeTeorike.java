/*
 * 
 * 5.5 Describe the four basic elements of counter-controlled repetition.
 * 
 * Four basic elements of counter-controlled repetition are : 1. loop counter -
 * a variable that counts the number of times a loop will be executed 2. Initial
 * value of the loop counter 3. increment or decrement the loop counter 4. loop
 * stopping condition
 * 
 * 5.6 Compare and contrast the while and for repetition statements.
 * 
 * Usually, for loop is used when we know exactly the number of times the loop
 * will be executed, and while loop when we don't. The for loop is more specific
 * and requires the components mentioned in ex.5.5 , while while loop needs at
 * least a exiting condition
 * 
 * 5.7 Discuss a situation in which it would be more appropriate to use a
 * do…while statement than a while statement. Explain why.
 * 
 * Situation where we might use do...while instead of while would be situations
 * in which we know for sure that the loop will run at least once.
 * 
 * 
 * 5.8 Compare and contrast the break and continue statements
 * 
 * Break is used to exit from a loop (of switch condition), while continue skips
 * the actual repetition of a loop and jumps to the next one.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 5.9 Find and correct the error(s) in each of the following segments of code:
 * a) For (i = 100, i >= 1, i++) System.out.println(i);
 * 
 * i-- instead of i++
 * 
 * b) The following code should print whether integer value is odd or even:
 * switch (value % 2) { case 0: System.out.println("Even integer"); case 1:
 * System.out.println("Odd integer"); }
 * 
 * A break should be put in each case
 * 
 * 
 * c) The following code should output the odd integers from 19 to 1: for (i =
 * 19; i >= 1; i += 2) System.out.println(i);
 * 
 * i -=2 instead of i+=2
 * 
 * d) The following code should output the even integers from 2 to 100: counter
 * = 2; do { System.out.println(counter); counter += 2; } While (counter < 100);
 * 
 * while instead of While
 * 
 * 
 * 5.10 What does the following program do?
 * 
 * // Exercise 5.10: Printing.java public class Printing { public static void
 * main(String[] args) { for (int i = 1; i <= 10; i++) { for (int j = 1; j <= 5;
 * j++) System.out.print('@');
 * 
 * System.out.println(); } } } // end class Printing
 * 
 * output :
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * @@@@@
 * 
 * 
 * 5.27 What does the following program segment do? for (i = 1; i <= 5; i++) {
 * for (j = 1; j <= 3; j++) { for (k = 1; k <= 4; k++) System.out.print('*');
 * System.out.println(); } // end inner for System.out.println(); } // end outer
 * for
 * 
 * 
 * output :
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 ****
 * 
 * 
 * 
 * 
 * 
 * 
 * 5.28 Describe in general how you’d remove any continue statement from a loop
 * in a program and replace it with some structured equivalent.
 * 
 * You can remove continue statement by copying all the code in the body of the
 * loop in an if condition, that tests the opposite of the condition to
 * continue.
 * 
 * 
 */