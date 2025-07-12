package strings;
import java.util.Scanner;
public class StringReverse
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input String: ");
		//String input = scanner.nextLine();	
		
		/**
        *	This can prints the string in reverse
		*  for(int i= input.length()-1 ; i >= 0 ; i--)
		*  {
		*      System.out.print(input.charAt(i));
		*  }
		*/
		
		/**
        *	Here we can create another string and a
		*	String reverse = "";
		*	for(int i = input.length()-1 ; i >= 0 ; i--)
		*	{
		*		reverse = reverse + input.charAt(i);
		*	}
		*	System.out.println(reverse);
		*/
		
		StringBuilder input = new StringBuilder();
		input = scanner.nextLine();
		System.out.println(input.reverse());
	}
}