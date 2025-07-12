package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoArrays
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array1 = {19,48,52,29,22,21};
		System.out.println("The array1 elements are " + Arrays.toString(array1));
		int[] array2 = {7,8,3,18,999,45};
		System.out.println("The array2 elements are " + Arrays.toString(array2));
		int[] array3 = new int[array1.length+array2.length];

	/**
	  * These are the built-in methods for merging the 2 arrays.
	
	  *	System.arraycopy(array1 , 0 , array3 , 0 , array1.length);
	  *	System.arraycopy(array2 , 0 , array3 , array1.length,array2.length);  
	  */
	    
		for(int i = 0 ; i < array1.length ; i++)
		{
			array3[i]=array1[i];
		}
		for(int i = 0 ; i < array2.length ; i++)
		{
			array3[array1.length + i] = array2[i];
		}
	    System.out.println("The array3 elements are " + Arrays.toString(array3));
	}
}