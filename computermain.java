package net.inheritance;
import java.util.Scanner;
public class computermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,series,color;
		int num;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name of laptop:");
		name=s.next();
		System.out.println("enter the series:");
		series=s.next();
		System.out.println("enter the color:");
		color=s.next();
		System.out.println("enter the modelnumber:");
	    num=s.nextInt();
	Laptop lp=new Laptop(name,num,series,color);
	System.out.println(lp.toString());
	lp.GetModelName(name);
	lp.GetModelNumber(num);
	lp.colorselection(color);
	
	
	System.out.println("enter the name of smartphone:");
	name=s.next();
	System.out.println("enter the series:");
	series=s.next();
	System.out.println("enter the color:");
	color=s.next();
	System.out.println("enter the modelnumber:");
    num=s.nextInt();
	//Smartphone s=new Smartphone("samsung",343,"dre34","pink");
    Smartphone s1=new Smartphone(name,num,series,color);
	System.out.println(s1.toString());
	s1.colorselection("red");
	s1.colorselection(color);
	
	
	System.out.print("enter the name tablet:");
	name=s.next();
	System.out.print("enter the series:");
	series=s.next();
	System.out.print("enter the color:");
	color=s.next();
	System.out.print("enter the modelnumber:");
    num=s.nextInt();
	//Tablet t=new Tablet("samsung1",3433443,"dre3454","pfgsfink");
    Tablet t = new Tablet(name,num,series,color);
	System.out.println(t.toString());
	t.GetModelNumber(3433223);
	t.colorselection(color);
	
	
	System.out.print("enter the name desktop:");
	name=s.next();
	System.out.println("enter the series:");
	series=s.next();
	System.out.println("enter the color:");
	color=s.next();
	System.out.println("enter the  modelnumber:");
    num=s.nextInt();
	//Desktop dt=new Desktop("name",334343,"drdadse34","pi3dfasnk");
    Desktop dt=new Desktop(name,num,series,color);
	System.out.println(dt.toString());
	dt.colorselection(color);
    s.close();
	}

}