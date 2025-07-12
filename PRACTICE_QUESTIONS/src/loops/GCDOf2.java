package loops;
import java.util.Scanner;
public class GCDOf2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 number:");
		int input1 = scanner.nextInt();
		System.out.println("Enter input2 number:");
		int input2 = scanner.nextInt();
		int gcd = 1;
		for(int i = 1 ; i <= input1 && i <= input2 ; i++)
		{
			if(input1 % i == 0 && input2 % i == 0)
			{
				gcd = i;
			}
		}
		System.out.println("The GCD of " + input1 + " and " + input2 + " is: " + gcd);
	}
}