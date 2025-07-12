package arrays;
import java.util.Arrays;
public class FindingPeakInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		if(array == null || array.length <= 1)
		{
			System.out.println("The Peak element is: "+ array[0]);
			return;
		}
		
		for(int i = 0 ; i < array.length ; i++)
		{
			boolean left = true , right = true;
			if( i > 0 && array[i] <= array[i-1]) // check for element to the left
			{
				left = false;
			}
			if( i < n-1 && array[i] <= array[i+1]) // check for element to the right
			{
				right = false;
			}
			// If array[i] is greater than its left as well as right, return its index
			if(left && right)
			{
				System.out.println("The peak element is: " + array[i]);
			}
		}
	}
}