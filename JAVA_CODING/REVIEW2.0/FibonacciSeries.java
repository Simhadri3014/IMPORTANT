import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int input = scanner.nextInt();
		int a = 0 , b = 1;
		System.out.print("FibonacciSeries: ");
		for(int i = 1 ; i <= input ; i++)
		{
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}