import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidateNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter the phone number");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String input = "^(\\+91|\\+0)\\s[6-9]\\d{4}\\s\\d{5}$";
		//Pattern pattern = Pattern.compile(input);
		if(Pattern.matches(input , number))
		{
			System.out.println("It is a valid phone number");
		}
		else
		{
			System.out.println("Not a valid phone number");
		}
	}
}