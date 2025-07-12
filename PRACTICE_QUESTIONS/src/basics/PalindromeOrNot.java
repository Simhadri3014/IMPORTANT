package basics;
import java.util.Scanner;
public class PalindromeOrNot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		int sum = 0 , temp = input;
		while(input > 0)
		{
			int rem = input % 10;
			sum = (sum * 10) + rem;
			input = input / 10;
		}
		if(temp == sum) System.out.println(temp + " : is a Palindrome Number");
		else System.out.println(temp + " : is not a Palindrome Number");
	}
}