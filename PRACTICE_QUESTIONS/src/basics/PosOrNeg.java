package basics;
import java.util.Scanner;
public class PosOrNeg
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int input = scanner.nextInt();
		if(input > 0)
		{
			System.out.println(input + " is a positive number");
		}
		else if(input < 0)
		{
			System.out.println(input + " is a negative number");
		}
		else
		{
			System.out.println("Please enter correct input ");
		}
	}
}