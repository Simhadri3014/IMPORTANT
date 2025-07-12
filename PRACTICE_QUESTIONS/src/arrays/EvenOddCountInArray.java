package arrays;
import java.util.Arrays;
public class EvenOddCountInArray
{
	public static void main(String[] args)
	{
		int[] array ={19,52,22,21,48,29};
		int  n = array.length;
		System.out.println("The array elements are: " + Arrays.toString(array));
		int evenCount = 0 , oddCount = 0;
		for(int i = 0 ; i < n ; i++)
		{
			if(array[i] % 2 == 0) evenCount++;
			else if(array[i] %2 != 0) oddCount++;
		}
		System.out.println("The even count of the array is: " + evenCount);
		System.out.println("The odd count of the array is: " + oddCount);

	}
}