package arrays;
import java.util.Arrays;
public class MoveZerosToEnd
{
	public static void main(String[] args)
	{
		int[] array ={0,0,19,52,0,22,21,48,0,29,0};
		System.out.println("The array elements are: " + Arrays.toString(array));
		int index = 0;
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i] != 0) array[index++] = array[i];
		}
		while(index < array.length)
		{
			array[index++] = 0;
		}
		System.out.println("After modifying the array elements are: " + Arrays.toString(array));
	}
}