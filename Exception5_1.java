package net.Exceptions;

public class Exception5_1
{
	
	public void printArray(int [] array) throws ArrayIndexOutOfBoundsException
	 {
	
		for(int i=0;i<20;i++) 
		{
			System.out.println("value at Index:"+array[i]);
		}
		throw new ArrayIndexOutOfBoundsException("Array is out of range");		
	 }
	
	public void main(String[] args)
	{
		 Exception5 e5 =new Exception5();
	     int[] arr1= {0,1,2,3,4,5,6,7,8,9,10};
	    e5.printArray(arr1);
	    try
	    {
	    printArray(arr1);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("caught in main");
			 
		 }
		
	}
}	

