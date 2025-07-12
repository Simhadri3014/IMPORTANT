package basics;
import java.util.Scanner;
public class SquareCubeNum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		double input = scanner.nextDouble();
		System.out.println("The suare of "+ input + " is: " + Math.pow(input , 2));
		System.out.println("The cubic of "+ input + " is: " + Math.pow(input , 3));
	}
}