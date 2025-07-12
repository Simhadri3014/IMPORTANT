package arrays;
import java.util.Arrays;
public class FindingDuplicatesInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,0,22,21,0,48,29,19,0};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		System.out.println("The duplicate elements in the array are: ");
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i+1 ; j< n ; j++)
			{
				if(array[i] == array[j] && array[j] != 0 && array[i] != 0)
				{
					array[j]=0;
					System.out.print(array[i] + " ");
				}
			}
		}
	}
}