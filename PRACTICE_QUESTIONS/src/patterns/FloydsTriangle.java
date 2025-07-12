package patterns;
import java.util.Scanner;
public class  FloydsTriangle
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input number:");
		int input = scanner.nextInt();
		
	//	1 2 3 4
	//	5 6 7 
	//	8 9 
	//	10
	//	int value = 1;
	//	for(int i = 1 ; i <= input ; i++)
	//	{
	//		for(int j = i ; j <= input ; j++)
	//		{
	//			System.out.print(value + " ");
	//			value++;
	//		}
	//		System.out.println();
	//	}
	//	1
	//	2 3
	//	4 5 6
	//	7 8 9 10
		int value = 1;
		for(int i = 1 ; i <= input ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
	}
}