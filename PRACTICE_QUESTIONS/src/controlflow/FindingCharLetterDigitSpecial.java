package controlflow;
import java.util.Scanner;
public class FindingCharLetterDigitSpecial
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input character: ");
		char input = scanner.next().charAt(0);
		if(Character.isLetter(input))
		{
			System.out.println(input + " is an Alphabet");
		}
		else if(Character.isDigit(input))
		{
			System.out.println(input + " is a Number");
		}
		else if(!Character.isDigit(input) && !Character.isLetter(input))
		{
			System.out.println(input + " is a Special Character");
		}
	}
}