package loops;
import java.util.Scanner;
public class  FactorialUsingWhile
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		int fact =1 , i = 1;
		while(i <= input)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("The factorial of " + input + " is: " + fact);
	}
}