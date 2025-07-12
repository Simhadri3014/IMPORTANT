package basics;
import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		int count = 0;
		for(int i = 2 ; i < Math.sqrt(input) ; i++)
		{
			if(input % i == 0)
			{
				count = 1;
				break;
			}
			
		}
		if(count == 1) System.out.println(input + " : is not a Prime Number");
		else System.out.println(input + " : is a Prime Number");
	}
}