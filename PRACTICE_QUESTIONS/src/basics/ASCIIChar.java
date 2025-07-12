package basics;
import java.util.Scanner;
public class ASCIIChar
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input character: ");
		char input = scanner.next().charAt(0);
		int value = (int) input;
		System.out.println(value);
		
	}
}