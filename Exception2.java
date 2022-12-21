package net.Exceptions;

public class Exception2 {

	@SuppressWarnings("null")
	public static void main(String[] args) 
	
	{
		try// TODO Auto-generated method stub
		{
		String name=null;
		System.out.println(name.length());
		//throw new NullPointerException("Please assign value to name");
		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}

		  System.out.println("Please assign value");
		  
		  
		  
	}

}
