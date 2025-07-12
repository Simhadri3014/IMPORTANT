package basics;
import java.util.Scanner;
public class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fahrenheit: ");
		double  fahrenheit= scanner.nextDouble();
		double celsius = (fahrenheit - 32 )* 5/9;
		System.out.println("After conversion the celsius is: " + celsius);
	}
}