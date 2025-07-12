package arrays;
import java.util.Arrays;
public class SearchElementInArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = {19,48,52,29,22,21};
		System.out.println("The array elements are " + Arrays.toString(array));
		System.out.println("Enter the key element want to be search: ");
		int key = scanner.nextInt();
		boolean flag = false;
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i] == key) flag = true; 
		}
		System.out.println(flag ? "Found......." : "Not found.....");
	}
}