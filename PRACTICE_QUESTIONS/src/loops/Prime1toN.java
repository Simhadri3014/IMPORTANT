package loops;
import java.util.Scanner;
public class Prime1toN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 number:");
		int input = scanner.nextInt();
		for(int i = 2 ; i < input ; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}	
	}
	public static boolean isPrime(int value)
	{
		for(int i = 2 ; i < value ; i++)
		{
			if(value % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}