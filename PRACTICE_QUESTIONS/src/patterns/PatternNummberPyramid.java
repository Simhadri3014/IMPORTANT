package patterns;
import java.util.Scanner;
public class PatternNummberPyramid
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		
	//	    1
	//	  2 3 4 
	//	5 6 7 8 9 
		int value = 1;
		for(int i = 1 ; i <= input ; i++)
		{
			for(int j = 1 ; j <= input - i ; j++)
			{
				System.out.print("  ");
			}
			for(int k = 1 ; k <= i ; k++)
			{
				System.out.print(value + " ");
				value++;
			}
			for(int k = 1 ; k < i ; k++)
			{
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
	//	        1
	//		  2 1 2
	//		3 2 1 2 3
	//	  4 3 2 1 2 3 4
	//	5 4 3 2 1 2 3 4 5
	//	for(int i = 1 ; i <= input ; i++)
	//	{
	//		for(int j = 1 ; j <= input - i ; j++)
	//		{
	//			System.out.print("  ");
	//		}
	//		for(int k = i ; k >= 1 ; k--)
	//		{
	//			System.out.print(k + " ");
	//		}
	//		for(int l = 2 ; l <= i ; l++)
	//		{
	//			System.out.print(l + " ");
	//		}
	//		System.out.println();
	}
}