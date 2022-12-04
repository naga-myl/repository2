package net.agecompare;
import java.util.Random;
import java.lang.Math;

public class Age_Compare {

	//private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ageuser1, ageuser2;
  Random r1= new Random();
  	ageuser1 =r1.nextInt(50);
  ageuser2= r1.nextInt(50);
 
/* s = new Scanner(System.in);
 ageuser1=s.nextInt();
 ageuser2=s.nextInt();*/
 
  System.out.println("enter the age of user1:" +ageuser1);
  System.out.println("enter the age of user2:" +ageuser2);
 /*int old = Math.max(ageuser1, ageuser2);
  System.out.println("The oldest person is :" +old);*/
  if(ageuser1==ageuser2)
  {
  
  System.out.println("Both are same age");
	}
  else
  {
	  int old = Math.max(ageuser1, ageuser2);
  System.out.println("The oldest person is :" +old);
  }
	
}}