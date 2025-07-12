package controlflow;
import java.util.Scanner;
public class QuadraticRoots
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the co-efficient of a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter the co-efficient of b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter the co-efficient of c: ");
		double c = scanner.nextDouble();
		
		double discriminant =  (b * b) - (4 * a * c);
		if(discriminant > 0)
		{
			double root1= (-b + (b*b - (4 * a * c)))/2 * a ;
			double root2= (-b - (b*b - (4 * a * c)))/2 * a ;
			System.out.println("The roots are real and distinct");
			System.out.println("The 1st root is: " + root1);
			System.out.println("The 2nd root is: " + root2);
		}
		else if(discriminant == 0)
		{
			double root = -b / (2 * a);
			System.out.println("The roots are real and equal");
			System.out.println("The root is: " + root);
		}
		else
		{
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant)/(2 * a);
			System.out.println("The roots are complex");
			System.out.println("Root1: " + realPart + " + " + imaginaryPart + "i");
			System.out.println("Root2: " + realPart + " - " + imaginaryPart + "i");
		}
		
		
	}
}