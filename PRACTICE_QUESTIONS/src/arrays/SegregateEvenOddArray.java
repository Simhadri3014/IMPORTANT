package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SegregateEvenOddArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array ={19,52,22,21,48,29};
		System.out.println("Before segregating: " + Arrays.toString(array));
		int l = 0 , h = array.length-1;
		while(h >= l)
		{
			if(array[l] % 2 != 0)
			{
				if(array[h] % 2 == 0)
				{
					int temp = array[l];
					array[l] = array[h];
					array[h] = temp;
					l++;
					h--;
				}
				else
				{
					h--;
				}
			}
			else
			{
				l++;
			}
		}
		System.out.println("After segregating: " + Arrays.toString(array));
	}
}