package arrays;
import java.util.Arrays;
public class MaxProductOf2InArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		System.out.println("The array elements are: " + Arrays.toString(array));
		int max = 0, value1 = 0 , value2 = 0;
		for(int i = 0 ; i < array.length ; i++)
		{
			for(int j = i+1 ; j < array.length ; j++)
			{
				int product = array[i] * array[j];
				if(product > max)
				{
					max = product;
					value1 = array[i];
					value2 = array[j];
				}
			}
		}
		System.out.println(" The max product elements are " + value1 + " and " + value2 + ": " + max);
	}
}