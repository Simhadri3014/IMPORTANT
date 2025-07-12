package basics;
import java.util.Scanner;
public class ArmstrongOrNot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		int sum = 0 , temp = input;
		while(input > 0)
		{
			int rem = input % 10;
			sum = sum + rem * rem * rem;
			input = input / 10;
		}
		if(temp == sum) System.out.println(temp + " : is a Armstrong Number");
		else System.out.println(temp + " : is not a Armstrong Number");
	}
}