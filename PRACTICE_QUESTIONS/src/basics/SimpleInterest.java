package basics;
import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		double  principalAmount= scanner.nextDouble();
		System.out.println("Enter the rate: ");
		double  rate= scanner.nextDouble();
		System.out.println("Enter the time: ");
		double  time= scanner.nextDouble();
		
		double simpleInterest = (principalAmount * time * rate) / 100;
		System.out.println("After conversion the simpleInterest is: " + simpleInterest);
	}
}