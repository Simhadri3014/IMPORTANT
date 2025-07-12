package arrays;
import java.util.Arrays;
public class LongestDecreasingSubsequence
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		if(array == null || array.length <= 1)
		{
			System.out.println("The longest decreasing subsequence of the given array is: ");
			return;
		}
		int max = 1 , count = 1;
		for(int i = 0 ; i < array.length-1 ; i++)
		{
			
			if(array[i] > array[i+1])
			{
				count++;
				if(count > max )
				{
					max = count;
				}
			}
			else
			{
				count = 1;
			}
		}
		System.out.println("The longest decreasing subsequence of the given array is: " + max);
	}
}