package basics;
import java.util.Scanner;
public class CompundInterest
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
		System.out.println("Enter the compoundFreqency: ");
		int  compoundFreqency= scanner.nextInt();
		
		double compundInterest = principalAmount * Math.pow((1 + (rate / compoundFreqency)), (compoundFreqency * time));
		System.out.println("After conversion the compundInterest is: " + compundInterest);
	}
}