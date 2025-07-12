import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		int[] array = new int[5];
		for(int m = 0 ; m < array.length ; m++)
		{
			array[m] = scanner.nextInt();
		}
		System.out.println("Before removing duplicates: The elements are: ");
		for(int m = 0 ; m < array.length ; m++)
		{
			System.out.print(array[m] + " ");
		}
		System.out.println();
		Set<Integer> object = new HashSet<>();
		for(int m = 0 ; m < array.length ; m++)
		{
			object.add(array[m]);
		}
		System.out.println("After removing duplicates: The elements are: ");
		System.out.println(object);
		
	}
}