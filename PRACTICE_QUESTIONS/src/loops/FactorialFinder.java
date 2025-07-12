package loops;
import java.util.Scanner;
public class FactorialFinder
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = scanner.nextInt();
		int fact = 1;
		for(int i = 1 ; i <= input ; i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of the given " + input + " is: " + fact);
	}
}