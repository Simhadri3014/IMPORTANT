import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 1st string");
		String input1 = scanner.nextLine();
		
		System.out.println("Enter the 2nd string");
		String input2 = scanner.nextLine();
		
		char[] array1 = input1.toCharArray();
		char[] array2 = input2.toCharArray();
        for(int i = 0 ; i < array1.length ; i++)
		{
			System.out.print(array1[i] + " ");
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println(Arrays.equals(array1,array2) ? "Valid Anagram" : "Not Valid Anagram");
		//if(Arrays.equals(array1,array2))
		//{
		//	System.out.println("The given two strings are Valid Anagram");
		//}
		//else
		//{
		//	System.out.println("The given two strings are not Valid Anagram");
		//}
	}
}