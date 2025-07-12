package loops;
import java.util.Scanner;
public class  ReverseNto1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		System.out.println("The reverse numbers from " + input + " to 1 are: ");
		for(int  i = input ; i > 0 ; i--)
		{
			System.out.println(i);
		}
	}
}