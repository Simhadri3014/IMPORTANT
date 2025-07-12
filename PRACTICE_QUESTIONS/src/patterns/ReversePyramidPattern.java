package patterns;
import java.util.Scanner;
public class  ReversePyramidPattern
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		
	//	*********
	//	 *******
	//	  *****
	//	   ***
	//	    *
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