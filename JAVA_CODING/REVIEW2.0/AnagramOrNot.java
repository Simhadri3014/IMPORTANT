import java.util.Scanner;
import java.util.Arrays;
public class AnagramOrNot
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st input String: ");
		String input1 = scanner.nextLine().toLowerCase();
		System.out.println("Enter the 2nd input String: ");
		String input2 = scanner.nextLine().toLowerCase();
		
		if(input1.length() != input2.length())
		{
			System.out.println("Not an anagram");
		}
		char[] array1 = input1.toCharArray();
		char[] array2 = input2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1 , array2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
	
}