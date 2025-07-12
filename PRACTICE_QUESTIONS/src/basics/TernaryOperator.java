package basics;
import java.util.Scanner;
public class TernaryOperator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number1: ");
		int input1 = scanner.nextInt();
		System.out.println("Enter the input number2: ");
		int input2 = scanner.nextInt();
		System.out.println( input1 > input2 ? "Input 1 is big" : "Input2 is big");

	}
}