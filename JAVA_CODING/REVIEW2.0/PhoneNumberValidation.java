import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PhoneNumberValidation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String input = scanner.nextLine();
		String regex = "^(\\+91 |0)[6-9][0-9]{4} [0-9]{5}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches()) System.out.println("Valid Phone Number");
		else  System.out.println("Not a valid phone number");
	}
}