package arrays;
import java.util.Arrays;
public class FindingMaxInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length , max = array[0];
		System.out.println("The array elements are: " + Arrays.toString(array));
		for(int i = 1 ; i < n ; i++)
		{
			if(array[i] > max) max = array[i];
		}
		System.out.println("The max element of the array is: " + max);
	}
}