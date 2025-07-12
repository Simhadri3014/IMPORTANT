package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class RotateArrayLeftByN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array ={19,52,22,21,48,29};
		
		System.out.println("Enter the N to rotate array to left");
		int rotate = scanner.nextInt();
		System.out.println("Before rotating: " + Arrays.toString(array));
		rotateArray(array , rotate);
		System.out.println("After rotating: " + Arrays.toString(array));
	}
	static void rotateArray(int[] array , int rotate)
	{
		int size = array.length;
		for(int i = 0 ; i < rotate ; i++)
		{
			int first = array[0];
			for(int j = 0 ; j <= size-2 ; j++)
			{
				array[j] = array[j+1];
			}
			array[size-1] = first;
		}
		
	}
}