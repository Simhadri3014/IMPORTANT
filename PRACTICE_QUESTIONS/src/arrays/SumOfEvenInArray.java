package arrays;
import java.util.Arrays;
public class SumOfEvenInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		int evenSum = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(array[i] % 2 == 0) evenSum += array[i];
		}
		System.out.println("The evenSum of the array is: " + evenSum);

	}
}