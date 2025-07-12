package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Finding2ndBigInArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = {19,48,52,29,22,21};
		System.out.println("The array elements are " + Arrays.toString(array));
		int max = Integer.MAX_VALUE;
		int secMax = 0;
		for(int i = 1 ; i < array.length ; i++)
		{
			if(array[i] > max)
			{
				secMax = max;
				max = array[i]; 
			}
			else
			{
				secMax = array[i];
			}
		}
		// Or we can sort the array and print the " array.length-1 " element.
		System.out.println("The second largest element is: " + secMax);
	}
}