package arrays;
import java.util.Arrays;
public class SortArrayDescending
{
	public static void main(String[] args)
	{
		int[] array = {19,48,52,29,22,21};
		System.out.println("Before sort the array elements are " + Arrays.toString(array));
		for(int i = 0 ; i < array.length ; i++)
		{
			for(int j = i+1 ; j < array.length; j++)
			{
				if(array[i] < array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("After sort the array elements are " + Arrays.toString(array));
	}
}