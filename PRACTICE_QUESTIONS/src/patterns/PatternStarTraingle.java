package patterns;
import java.util.Scanner;
public class PatternStarTraingle
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		for(int i = 1 ; i <= input ; i++)
		{
			for(int j = 1 ; j <= input - i ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++)
			{
				System.out.print("*");
			}
			for(int k = 1 ; k < i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}