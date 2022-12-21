package net.Exceptions;

public class Exception4 {

	public static void main(String[] args) throws ArithmeticException
	{
	try
	{
		// TODO Auto-generated method stub
		
		int first=10;
		int sec=0;
		System.out.println(first/sec);
		throw new ArithmeticException( "Value should not be a zero int the denominator");

	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		
	}

}
}