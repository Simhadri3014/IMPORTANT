package arrays;
import java.util.Arrays;
public class FindingMissingNumOf1toN
{
	public static void main(String[] args)
	{
		int[] array ={5,3,4,1};
		System.out.println("The array elements are: " + Arrays.toString(array));
		
		System.out.println("The missing element in the array is: " + isMissing(array));
	}
	public static int isMissing(int[] array)
	{
		for(int i = 1 ; i <= array.length+1 ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j < array.length ; j++)
			{
				if(array[j] == i)
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				return i;
			}
		}
		return -1;
	}
}