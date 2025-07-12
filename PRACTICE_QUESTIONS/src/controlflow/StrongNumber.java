package controlflow;
import java.util.Scanner;
public class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input number: ");
		int input = scanner.nextInt();
		int temp = input, sum = 0;
		while(input > 0)
		{
			int rem = input % 10;
			int value = factorial(rem);
			sum = sum + value;
			input = input / 10;
		}
		if(sum == temp) System.out.println(temp + " it is a Strong Number");
		else System.out.println(temp + " it is not a Strong Number");
	}
	public static int factorial(int rem)
	{
		int value = 1;
		for(int i = 1 ; i<= rem ; i++)
		{
			value = value * i;
		}
		return value;
	}
}