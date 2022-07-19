package Lesson2;



public class array
{
	public static void main(String[] args)
	{

		//single-dimensional array
		int a[]= {2,4,6,8,10};
		for(int i=0;i<5;i++)
		{
		System.out.println("Elements of array a["+i+"]" );
		System.out.println(a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		 System.out.println("\nLength of row 1: " + b[0].length);
    }
	
	
}	            
		      
		     
		      
		


