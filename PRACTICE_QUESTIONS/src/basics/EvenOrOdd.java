package basics;
import java.util.Scanner;
public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int input = scanner.nextInt();
		if(input % 2 == 0)
		{
			System.out.println(input + " is an even number");
		}
		else
		{
			System.out.println(input + " is an odd number");
		}
	}
}