package net.random;
import java.util.Random;

/*Create a Maven project in eclipse. Your project should have a class called
MyRandomMethods() and a class Main().
The class MyRandomMethods should have five methods:
• randomBetween1and10(): The method returns an int between 1 and 10.
• randomBetween11and20(): The method returns an int between 11 and 20.
• randomBetween21and30(): The method returns an int between 21 and 30.
• randomBetween31and40(): The method returns an int between 31 and 40.
• randomBetween41and50(): The method returns an int between 41 and 50.
The Main class: you should instantiate an object of the class MyRandomMethods and print
the result of some of the methods on the screen.
Now add a JUnit test class to your project and test if the methods are returning the right
values. Add around 5 tests to each method.*/

public class MyRandomMethods {
	

	public int randomBetween1and10(int a,int b)
	{
	 Random r=new Random();
	
	 int d=r.nextInt(a,b);
	 return d;
    }

	public int randomBetween11and20(int a,int b)
	{
	 Random r=new Random();
	 int d=r.nextInt(a,b);
	 return d;
    }
	public int randomBetween21and30(int a,int b)
	{
   	 Random r=new Random();
   	
   	 int d=r.nextInt(a,b);
   	 return d;
       }
	public int randomBetween31and40(int a,int b)
   	{
   	 Random r=new Random();
   	 
   	 int d=r.nextInt(a,b);
   	 return d;
    	    }
	public int randomBetween41and50(int a,int b)
	{	
	Random r=new Random();

   	 int d=r.nextInt(a,b);
   	 return d;
	    
	}

}