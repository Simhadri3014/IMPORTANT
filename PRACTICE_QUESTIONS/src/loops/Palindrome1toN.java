package loops;
import java.util.Scanner;
public class Palindrome1toN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 number:");
		int input = scanner.nextInt();
		System.out.println("The Palindrome numbers from 1 to " + input + "are: ");
		for(int i = 1 ; i < input ; i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i);
			}
		}	
	}
	public static boolean isPalindrome(int value)
	{
		int temp = value , sum = 0;
		while(value > 0)
		{
			int rem = value % 10;
			sum = (sum * 10) + rem;
			value = value / 10;
		}
		if(sum == temp)
		{
			return true;
		}
		return false;
	}
}