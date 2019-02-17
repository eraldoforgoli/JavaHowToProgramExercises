/*
 

4.34 (What’s Wrong with This Code?) What is wrong with the following statement? Provide the
correct statement to add one to the sum of x and y.
System.out.println(++(x + y));


Answer : you can't increment a calculation with the prefix increment. Only variables are allowed to be incremented with the prexix or postfix incrementors
A solution would be : 
System.out.printl((++x +y)



*/