package loops;
import java.util.Scanner;
public class  SkippingMultiplesOf4UptoN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		System.out.println("The numbers not multiples of 4 from 1 to " + input + " are: ");
		for(int  i = 1 ; i <= input ; i++)
		{
			if(i % 4 != 0) System.out.print(i + " ");
		}
	}
}