package arrays;
import java.util.Arrays;
public class CheckingArraySortedOrNot
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		System.out.println("The array elements are: " + Arrays.toString(array));
		if(isSorted(array)) System.out.println("Array is Sorted");
		else System.out.println("Array is not sorted");
	}
	public static boolean isSorted(int[] array)
	{
		if(array == null || array.length <= 1)
		{
			return true;
		}
		for(int i = 0 ; i < array.length-1 ; i++)
		{
			if(array[i] > array[i+1]) 
			{
				return false;
			}
		}
		return true;
	}	
}