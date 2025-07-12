package controlflow;
import java.util.Scanner;
public class FindingCharLowUp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input character: ");
		char input = scanner.next().charAt(0);
		if(Character.isLowerCase(input) && Character.isLetter(input))
		{
			System.out.println(input + " is in lower - case");
		}
		else if(Character.isUpperCase(input) && Character.isLetter(input))
		{
			System.out.println(input + " is in upper - case");
		}
	}
}