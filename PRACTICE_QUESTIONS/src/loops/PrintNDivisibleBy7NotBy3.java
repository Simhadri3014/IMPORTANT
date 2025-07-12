package loops;
import java.util.Scanner;
public class  PrintNDivisibleBy7NotBy3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		int i = 1;
		System.out.println("The numbers divisible by 3 and 5 up to "+ input + " are:");
		while(i < input)
		{
			if(i % 3 != 0 && i % 7 ==0)
			{
				System.out.print(i + " ");
			} 
			i++;
		}
	}
}