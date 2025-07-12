package arrays;
import java.util.Arrays;
public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] array = {19,48,52,29,22,21};
		System.out.println("Before reverse the array elements are " + Arrays.toString(array));
		int l = 0 , r = array.length-1 , temp;
		while(l < r)
		{
			temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			l++;
			r--;
		}
		System.out.println("After reverse the array elements are " + Arrays.toString(array));
	}
}