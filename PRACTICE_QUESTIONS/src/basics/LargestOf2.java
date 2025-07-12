package basics;
import java.util.Scanner;
public class LargestOf2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number1: ");
		int input1 = scanner.nextInt();
		System.out.print("Enter the input number2: ");
		int input2 = scanner.nextInt();
		int value = input1 > input2 ? input1 : input2;
		System.out.println("The largest number is: " + value);
	}
}