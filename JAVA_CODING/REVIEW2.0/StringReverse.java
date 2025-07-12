import java.util.Scanner;
public class StringReverse
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input String: ");
		String input = scanner.nextLine();
		String[] array = input.split(" ");
		for(int i = 0 ; i < array.length ; i++)
		{
			String reverse = array[i];
			reverseString(reverse);
		}
	}
	public static void reverseString(String reverse)
	{
		for(int i = reverse.length()-1 ; i >=0 ; i--)
		{
			System.out.print(reverse.charAt(i));
		}
		System.out.print(" ");
	}
}