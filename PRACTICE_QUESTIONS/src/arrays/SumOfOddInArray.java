package arrays;
import java.util.Arrays;
public class SumOfOddInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		int oddSum = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(array[i] % 2 != 0) oddSum += array[i];
		}
		System.out.println("The oddSum of the array is: " + oddSum);
	}
}