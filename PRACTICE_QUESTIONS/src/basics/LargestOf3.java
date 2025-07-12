package basics;
import java.util.Scanner;
public class LargestOf3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number1: ");
		int input1 = scanner.nextInt();
		System.out.print("Enter the input number2: ");
		int input2 = scanner.nextInt();
		System.out.print("Enter the input number3: ");
		int input3 = scanner.nextInt();
		if(input1 > input2 && input1 > input3) System.out.println("The largest number is: " + input1);
		else if(input2 > input1 && input2 > input3) System.out.println("The largest number is: " + input2);
		else System.out.println("The largest number is: " + input3
		
		
		
		);
	}	
}