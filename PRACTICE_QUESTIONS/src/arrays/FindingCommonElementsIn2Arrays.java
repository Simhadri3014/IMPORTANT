package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class FindingCommonElementsIn2Arrays
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array1 = {19,48,52,29,22,21};
		int[] array2 = {19,42,50,29,29,20};
		System.out.println("The array1 elements are " + Arrays.toString(array1));
		System.out.println("The array2 elements are " + Arrays.toString(array2));
		Arrays.sort(array1);
		Arrays.sort(array2);
		int previous = Integer.MIN_VALUE; 
		for(int i = 0 ; i < array1.length ; i++)
		{
			for(int j = 0 ; j < array2.length ; j++)
			{
				if(array1[i] == array2[j] && array1[i] != previous)
				{
					System.out.print(array1[i] + " ");
					previous = array1[i];
					break;
				}
			}
		}
	}
}