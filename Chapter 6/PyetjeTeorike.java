/*


Exercises
6.7 What is the value of x after each of the following statements is executed?
a) x = Math.abs(7.5); 7.5
b) x = Math.floor(7.5); 7.0
c) x = Math.abs(0.0); 0.0
d) x = Math.ceil(0.0); 0.0
e) x = Math.abs(-6.4); 6.4
f) x = Math.ceil(-6.4); -6.0
g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))); -14.0



6.11 Answer each of the following questions:
a) What does it mean to choose numbers “at random”?
	Means to choose numbers that have the same posibility to be choosen (From a range of numbers)
	
b) Why is the nextInt method of class SecureRandom useful for simulating games of
chance?

qBecause it provides random numbers from a rande of numbers.
 
c) Why is it often necessary to scale or shift the values produced by a SecureRandom object?
	Because different applications require diferent range of random numbers.

d) Why is computerized simulation of real-world situations a useful technique?
	Because it offers better accuracy and wider range of possibilities.

6.12 Write statements that assign random integers to the variable n in the following ranges:
a) 1 ≤ n ≤ 2.
n = 1 + randomNumbers.nextInt(2);

b) 1 ≤ n ≤ 100.
n = 1 + randomNumbers.nextInt(100);


c) 0 ≤ n ≤ 9.
n = randomNumbers.nextInt(10);

d) 1000 ≤ n ≤ 1112.
n = 1000 + randomNumbers.nextInt(1112);

e) –1 ≤ n ≤ 1.
n = -1 + randomNumbers.nextInt(3);

f) –3 ≤ n ≤ 11.
n = -3 + randomNumbers.nextInt(15);

6.13 Write statements that will display a random number from each of the following sets:

a) 2, 4, 6, 8, 10.
	System.out.println(2 + randomNumbers.nextInt(5)*2);

b) 3, 5, 7, 9, 11.
System.out.println(3 + randomNumbers.nextInt(5)*2);

c) 6, 10, 14, 18, 22.

System.out.println(6 + randomNumbers.nextInt(5)*4);



*/