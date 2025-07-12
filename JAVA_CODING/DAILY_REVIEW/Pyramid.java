import java.util.Scanner;
import java.util.Arrays;
public class Pyramid
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number:");
		//int input = scanner.nextInt();
		int[] arr = findingPrime(50);
		//for(int i = 1 ; i <= input ; i++)
		//{
		//	for(int j = 1 ; j <= i ; j++)
		//	{
		//		System.out.print(" ");
		//	}
		//	for(int k = input-i ; k > 0 ; k--)
		//	{
		//		System.out.print(value+ " ");
		//		value--;
		//	}
		//	System.out.println();
		//}
		System.out.println(Arrays.toString(arr));
	}
	public static int[] findingPrime(int value)
	{
		int k = (value* (value+1))/2;
		int[] array1 = new int[k];
		int range = 0;
		for(int i = 2 ; i <= value ; i++)
		{
			if(isPrime(i))
			{
				array1[range++] = i;
			}
		}
		return array1;
	}
	public static boolean isPrime(int n)
	{
		for(int i = 2 ; i< n ; i++)
		{
			if(n % i == 0) return false;
		}
		return true;
	}
}