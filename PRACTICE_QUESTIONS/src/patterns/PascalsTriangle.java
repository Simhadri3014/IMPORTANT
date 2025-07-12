package patterns;
import java.util.Scanner;
public class  PascalsTriangle
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		for(int i = 0 ; i < input ; i++)
		{
			for(int j = 1 ; j <= input - i ; j++)
			{
				System.out.print(" ");
			}
			int value = 1;
			for(int k = 0 ; k <= i ; k++)
			{
				System.out.print(value+ " ");
				value = value * (i - k) /  (k + 1);
			}
			System.out.println();
		}
	}
}