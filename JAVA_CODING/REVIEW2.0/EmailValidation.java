import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailValidation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String input = scanner.nextLine();
		String regex = "^[A-Za-z]+\\.[A-za-z]+\\d{1,10}@(enh\\.com|enh\\.in)$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches()) System.out.println("Valid Email Address");
		else  System.out.println("Not a valid email address");
	}
}