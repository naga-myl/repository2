package net.Exceptions;

public class Exception5
{	

	@SuppressWarnings("unused")
	public void printArray(int [] array)
	 {
		try 
		{
		for(int i=0;i<20;i++) 
		{
			System.out.println("value at Index:"+array[i]);
		
		
		}
		throw new ArrayIndexOutOfBoundsException("Array is out of range");
	  
	 }

	catch(ArrayIndexOutOfBoundsException e)
	 {
		System.out.println(e.toString());
		 
	 }
	  
	 }
	
public static void main(String[] args) throws  ArrayIndexOutOfBoundsException
	{
		// TODO Auto-generated method stub
     Exception5 e5 =new Exception5();
     int[] arr1= {0,1,2,3,4,5,6,7,8,9,10};
    e5.printArray(arr1);
	}


}		
	
   

