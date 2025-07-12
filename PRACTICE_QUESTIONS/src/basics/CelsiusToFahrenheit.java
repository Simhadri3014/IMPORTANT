package basics;
import java.util.Scanner;
public class CelsiusToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("After conversion the fahrenheit is: " + fahrenheit);
	}
}