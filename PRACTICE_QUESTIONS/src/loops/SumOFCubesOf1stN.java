package loops;
import java.util.Scanner;
public class  SumOFCubesOf1stN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		int sum = 0 , i = 1;
		while(i <= input)
		{
			sum = sum + (i * i * i);
			i++;
		}
		System.out.println("The sum of cubes of 1st " + input + " Natural Numbers are: " + sum);
	}
}