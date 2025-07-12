package arrays;
import java.util.Arrays;
public class FindingMinInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length , min = array[0];
		System.out.println("The array elements are: " + Arrays.toString(array));
		for(int i = 1 ; i < n ; i++)
		{
			if(array[i] < min) min = array[i];
		}
		System.out.println("The max element of the array is: " + min);
	}
}