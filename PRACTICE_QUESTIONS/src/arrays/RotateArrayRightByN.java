package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class RotateArrayRightByN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array ={19,52,22,21,48,29};
		
		System.out.println("Enter the N to rotate array to right");
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
			int last = array[size-1];
			for(int j = size-1 ; j > 0 ; j--)
			{
				array[j] = array[j-1];
			}
			array[0] = last;
		}
		
	}
}