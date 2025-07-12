package loops;
import java.util.Scanner;
public class  AlternateNumbers1toN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		System.out.println("The alternate numbers from 1 to " + input + " are: ");
		for(int  i = 1 ; i <= input ; i+=2)
		{
			System.out.println(i);
		}
	}
}