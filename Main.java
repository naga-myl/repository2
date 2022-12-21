package net.random;
/*• randomBetween41and50(): The method returns an int between 41 and 50.
The Main class: you should instantiate an object of the class MyRandomMethods and print
the result of some of the methods on the screen.
Now add a JUnit test class to your project and test if the methods are returning the right
values. Add around 5 tests to each method.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 MyRandomMethods rm=new MyRandomMethods();
 System.out.println("The result of numbers between 1 and 10 is :" +rm.randomBetween1and10(1, 10));
 System.out.println("The result of numbers between 11 and 20 is :"+rm.randomBetween11and20(11,20));
 System.out.println("The result of numbers between 21 and 30 is :"+rm.randomBetween21and30(21, 30));
 System.out.println("The result of numbers between 31 and 40 is :"+rm.randomBetween31and40(31, 40));
 System.out.println("The result of numbers between 41 and 50 is :"+rm.randomBetween41and50(41, 50));
 
	}
	

}
 