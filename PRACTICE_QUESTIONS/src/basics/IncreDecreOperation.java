package basics;
import java.util.Scanner;
public class IncreDecreOperation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number1: ");
		int input1 = scanner.nextInt();
		System.out.println("Enter the input number2: ");
		int input2 = scanner.nextInt();
		input1--;
		input2++;
		System.out.println("After Decrement: " + input1);
		System.out.println("After Increment: " + input2);
	}
}