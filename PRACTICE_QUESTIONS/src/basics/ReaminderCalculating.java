package basics;
import java.util.Scanner;
public class ReaminderCalculating
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number1: ");
		int input1 = scanner.nextInt();
		System.out.println("Enter the input number2: ");
		int input2 = scanner.nextInt();
		int remainder = input1 % input2;
		System.out.println("The remainder of " + input1 + " and " + input2 + " is: " + remainder);
	}
}