package basics;
import java.util.Scanner;
public class PrefectNumberOrNot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		int rem, sum = 0;
		for(int i = 1 ; i < input ; i++)
		{
			rem = input % i;
			if(rem == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == input) System.out.println(input + " : is a Prefect Number");
		else System.out.println(input + " : is not a Prefect Number");
	}
}