package basics;
import java.util.Scanner;
public class PrintingPrimitive
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input1: ");
		int input1 = scanner.nextInt();
		System.out.println("input1: " + input1);
		System.out.println("Enter the input2: ");
		scanner.next();
		String input2 = scanner.nextLine();
		System.out.println("input2: " + input2);
		System.out.println("Enter the input3: ");
		char input3 = scanner.next().charAt(0);
		System.out.println("input3: " + input3);
		scanner.close();
	}
}