package loops;
import java.util.Scanner;
public class FibonacciUptoN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = scanner.nextInt();
		int a = 0 , b = 1 , c = 1;
		System.out.print(a + " " + b + " ");
		while(c <= input)
		{
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}
	}
}