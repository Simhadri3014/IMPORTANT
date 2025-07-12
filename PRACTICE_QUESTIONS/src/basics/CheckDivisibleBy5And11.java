package basics;
import java.util.Scanner;
public class CheckDivisibleBy5And11
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		if(input % 5 == 0 && input % 11 == 0) System.out.println("It is divisible by 5 and 11");
		else System.out.println("It is not divisible by 5 and 11");
	}
}