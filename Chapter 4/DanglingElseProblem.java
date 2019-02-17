/*
 * 
 * 
 * 4.27 (Dangling-else Problem) Determine the output for each of the given sets
 * of code when x is 9 and y is 11 and when x is 11 and y is 9. The compiler
 * ignores the indentation in a Java program. Also, the Java compiler always
 * associates an else with the immediately preceding if unless told to do
 * otherwise by the placement of braces ({}). On first glance, you may not be
 * sure which if a particular else matches—this situation is referred to as the
 * “dangling-else problem.” We’ve eliminated the indentation from the following
 * code to make the problem more challenging. [Hint: Apply the indentation
 * conventions you’ve learned.] a) if (x < 10) if (y > 10)
 * System.out.println("*****"); else System.out.println("#####");
 * System.out.println("$$$$$");
 * 
 * 
 * 1. When x = 9, y = 11 :
 *****
 * 
 * $$$$$
 * 
 * 2. when x =11, y = 9 :
 * 
 * $$$$$ , Pasi ekzekutohet vetem rrjeshti i fundit kushti if i pare nuk
 * plotesohet, ndersa else lidhet me kushtin e dyte qe nuk plotesohet, pra nuk
 * ekzekutohet
 * 
 * 
 * 
 * 
 * 
 * b) if (x < 10) { if (y > 10) System.out.println("*****"); } else {
 * System.out.println("#####"); System.out.println("$$$$$"); }
 * 
 * 1. When x = 9, y = 11
 *****
 * 
 * 
 * 2. When x = 11, y = 9 ##### $$$$$
 * 
 * 
 * 
 * 
 * 
 * 
 * 4.28 (Another Dangling-else Problem) Modify the given code to produce the
 * output shown in each part of the problem. Use proper indentation techniques.
 * Make no changes other than inserting braces and changing the indentation of
 * the code. The compiler ignores indentation in a Java program. We’ve
 * eliminated the indentation from the given code to make the problem more
 * challenging. [Note: It’s possible that no modification is necessary for some
 * of the parts.]
 * 
 * 
 * if (y == 8) if (x == 5) System.out.println("@@@@@"); else
 * System.out.println("#####"); System.out.println("$$$$$");
 * System.out.println("&&&&&");
 * 
 * a) Assuming that x = 5 and y = 8, the following output is produced:
 * 
 * @@@@@ $$$$$ &&&&&
 * 
 * Code :
 * 
 * 
 * if (y == 8) if (x == 5) System.out.println("@@@@@"); else
 * System.out.println("#####"); System.out.println("$$$$$");
 * System.out.println("&&&&&");
 * 
 * b) Assuming that x = 5 and y = 8, the following output is produced:
 * 
 * @@@@@
 * 
 * Code :
 * 
 * if (y == 8) if (x == 5) System.out.println("@@@@@"); else {
 * System.out.println("#####"); System.out.println("$$$$$");
 * System.out.println("&&&&&"); }
 * 
 * 
 * c) Assuming that x = 5 and y = 7, the following output is produced. [Note:
 * The last three output statements after the else are all part of a block.]
 * 
 * ##### $$$$$ &&&&&
 * 
 * 
 * code :
 * 
 * 
 * if (y == 8){ if (x == 5) System.out.println("@@@@@"); }
 * 
 * else { System.out.println("#####"); System.out.println("$$$$$");
 * System.out.println("&&&&&"); }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */