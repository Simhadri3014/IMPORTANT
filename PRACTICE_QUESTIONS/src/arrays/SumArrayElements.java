package arrays;
import java.util.Arrays;
public class SumArrayElements
{
	public static void main(String[] args)
	{
		int[] array = {19,48,52,29,22,21};
		System.out.println("The array elements are " + Arrays.toString(array));
		int total = 0;
		for(int i = 0 ; i < array.length ; i++)
		{
			total = total + array[i];
		}
		System.out.println("The maximun element in the array is: " + total);
	}
}