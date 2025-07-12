package basics;
import java.util.Scanner;
public class LeapYearOrNot
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input year: ");
		int input = scanner.nextInt();
		if(input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) System.out.println(input + " is a Leap Year");
		else System.out.println(input + " is not a Leap Year");
	}
}