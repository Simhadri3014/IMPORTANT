package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class DeclareInitializeArray
{
	public static void main(String[] args)
	{
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements into an array: ");
		for(int i = 0 ; i < array.length ; i++)
		{
			array[i] = scanner.nextInt();
		}
		System.out.println("The array elements are " + Arrays.toString(array));
	}
}