package net.random;
import java.util.Random;
import java.util.random.RandomGenerator;
import net.random.MyRandomMethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class randomnumbers {

	private int a,a1,a2,a3,b,c,d,e;

	@Test
	public void test() {
		
		MyRandomMethods rm=new MyRandomMethods();
		Random r =new Random();
		
		 a=rm.randomBetween1and10(1, 10);
		 a1= rm.randomBetween1and10(1, 19);
		 a2= rm.randomBetween1and10(1, 9);
		 a3=rm.randomBetween11and20(5, 9);
		System.out.println("value of a is :" +a);
		System.out.println("value of a1 is :" +a1);
		System.out.println("value of a2 is :" +a2);
		System.out.println("value of a3 is :" +a3);
		
	    b=rm.randomBetween11and20(11,20); 
	    System.out.println("value of b is :" +b);
	   	 
		c=rm.randomBetween21and30(21, 30);
	    System.out.println("value of c is :" +c);
		
		d=rm.randomBetween31and40(31, 40);
		System.out.println("value of d is :" +d);
			
		 e=rm.randomBetween41and50(41, 50);
		 System.out.println("value of e is :" +e);
	
		
		
	
	
	}

}
