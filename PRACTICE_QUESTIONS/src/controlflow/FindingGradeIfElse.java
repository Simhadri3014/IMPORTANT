package controlflow;
import java.util.Scanner;
public class FindingGradeIfElse
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int input = scanner.nextInt();
		if(input >= 80 && input <= 100)
		{
			System.out.println("A - Grade");
		}
		else if(input >= 70 && input < 80)
		{
			System.out.println("B - Grade");
		}
		else if(input >=60 && input < 70)
		{
			System.out.println("C - Grade");
		}
		else
		{
			System.out.println("Fail......");
		}
	}
}