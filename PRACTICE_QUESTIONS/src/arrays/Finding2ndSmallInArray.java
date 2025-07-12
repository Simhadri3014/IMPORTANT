package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Finding2ndSmallInArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = {19,48,52,29,22,21};
		System.out.println("The array elements are " + Arrays.toString(array));
		int min = Integer.MIN_VALUE;
		int secMin = 0;
		for(int i = 1 ; i < array.length ; i++)
		{
			if(array[i] < min)
			{
				secMin = min;
				min = array[i]; 
			}
			else
			{
				secMin = array[i];
			}
		}
		// Or we can sort the array and print the " array[1] " element.
		System.out.println("The second largest element is: " + secMin);
	}
}