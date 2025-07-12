package patterns;
import java.util.Scanner;
public class  DiamondPatternStar
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
	//	    *
	//	   ***
	//	  *****
	//	 *******
	//	*********
	//	 *******
	//	  *****
	//	   ***
	//	    *
		for(int i = 1 ; i <= input ; i++)
		{
			for(int j = 1 ; j <= input - i ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++)
			{
				System.out.print("*");
			}
			for(int k = 1 ; k < i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0 ; i <= input ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <= input-i ; k ++)
			{
				System.out.print("*");
			}
			for(int l = 1 ; l < input-i ; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}