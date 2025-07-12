package loops;
import java.util.Scanner;
public class SumOfDigitsOfaNum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = scanner.nextInt();
		int sum = 0;
		while(input > 0)
		{
			int rem = input % 10;
			sum = sum + rem;
			input = input / 10;
		}
		System.out.println("The sum of given integers of a number: " + sum);
	}
}