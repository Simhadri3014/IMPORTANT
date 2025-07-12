package loops;
import java.util.Scanner;
public class  FactorialUsingDoWhile
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		int fact = 1 ; int i = 1;
		do
		{
			fact = fact * i;
			i++;
		}while(i <= input);
		System.out.println("The factorial of " + input + " is: " + fact);
	}
}