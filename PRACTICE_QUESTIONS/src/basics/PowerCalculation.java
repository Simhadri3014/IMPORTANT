package basics;
import java.util.Scanner;
public class PowerCalculation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base number: ");
		double base = scanner.nextDouble();
		System.out.println("Enter the exponent number: ");
		double exponent = scanner.nextDouble();
		System.out.println("The power of "+ base + " and " + exponent + " is: " + Math.pow(base , exponent));
	}
}