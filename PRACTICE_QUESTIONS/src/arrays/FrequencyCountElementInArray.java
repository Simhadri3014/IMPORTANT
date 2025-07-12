package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class FrequencyCountElementInArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = {19,48,52,29,22,21,19,52,52,29,29,19};
		System.out.println("The array elements are " + Arrays.toString(array));
		for(int i = 0 ; i < array.length ; i++)
		{
			int count = 1;
			for(int j = i+1 ; j < array.length ; j++)
			{
				if(array[i] == array[j])
				{
					count++;
					array[j] = 0;
				}
			}
			if(array[i]!=0)
			{
				System.out.println("The element of " + array[i] + " count is: " + count);
			}
		}
	}
}