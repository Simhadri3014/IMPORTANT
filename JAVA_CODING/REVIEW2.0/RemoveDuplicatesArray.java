import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = scanner.nextInt();
		Integer[] array = new Integer[size];
		System.out.println("Enter " + size + " elements:");
		for(int i = 0 ; i < size ; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(array));
		System.out.println("After removing duplicates: ");
		for(int number : uniqueSet)
		{
			System.out.print(number + " ");
		}
	}
}