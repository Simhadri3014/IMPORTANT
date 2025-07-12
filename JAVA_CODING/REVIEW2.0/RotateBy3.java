import java.util.Scanner;
public class RotateBy3
{
	public static void main(String[] args)
	{
		int[] array ={1,2,3,4,5,6,7};
		int shift = 3;
		for(int range = array.length - 1 ; range >= 0 ; range--)
		{
			if(range >= shift)
			{
				array[range] = array[range - shift];
			}
			else
			{
				array[range] = 0;
			}
		}
		for(int range = 0 ; range < array.length ; range++)
		{
			System.out.print(array[range] + " ");
		}
	}
}