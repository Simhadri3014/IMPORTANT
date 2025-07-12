package controlflow;
import java.lang.Math;
import java.util.Scanner;
public class FindingAbsolute
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double input = scanner.nextDouble();
		double value = Math.abs(input);
		System.out.println(value);
	}
}
