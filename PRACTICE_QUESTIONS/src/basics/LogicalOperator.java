package basics;
import java.util.Scanner;
public class LogicalOperator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int input = scanner.nextInt();
		if(input % 2 == 0 && input % 4 == 0 )
		{
			System.out.println("Big bang!.......");
		}

	}
}