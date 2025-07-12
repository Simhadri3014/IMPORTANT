package arrays;
import java.util.Arrays;
public class SmallestElementInArray
{
	public static void main(String[] args)
	{
		int[] array = {19,48,52,29,22,21};
		System.out.println("The array elements are " + Arrays.toString(array));
		int min = array[0];
		for(int i = 1 ; i < array.length ; i++)
		{
			if(array[i] < min) min = array[i];
		}
		System.out.println("The maximun element in the array is: " + min);
	}
}