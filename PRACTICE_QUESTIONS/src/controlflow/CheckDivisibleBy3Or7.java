package controlflow;
import java.util.Scanner;
public class CheckDivisibleBy3Or7
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		if(input % 3 == 0 || input % 7 == 0) System.out.println("It is divisible by 3 or 7");
		else System.out.println("It is not divisible by 3 and 7");
	}
}