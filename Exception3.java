package net.Exceptions;

public class Exception3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   try {
		int[] array1= {3,5,6,7,8,9};
		int [] array2= {2,4,6};
		System.out.println(array1[5]);
		array1=array2;
		System.out.println(array1[5]);
		//throw new ArrayIndexOutOfBoundsException("Increase the array2 length to array1");
   }
   catch(ArrayIndexOutOfBoundsException e)
	
	  {
	  // e.printStackTrace();
	   System.out.println(e.getMessage());
	   
	   
	   }
   
    
	}

}
