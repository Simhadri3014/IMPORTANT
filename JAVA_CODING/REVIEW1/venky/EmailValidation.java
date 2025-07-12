//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
import java.util.Scanner;
public class EmailValidation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name: ");
		String firstName = scanner.nextLine().trim();
		System.out.println("Enter the Last Name: ");
		String lastName = scanner.nextLine().trim();
		System.out.println("Enter the Email for validation");
		String email = scanner.nextLine().trim();
		
		if(firstName != null  && lastName != null && firstName.matches("^[A-Za-z]+$") && lastName.matches("^[A-Za-z]+$"))
		{
			//Pattern pattern = Pattern.compile("^[a-zA-Z]\\.[a-zA-Z] + \\d{1,10}@ + $");
			String regex = "^" + firstName + "." + lastName + "\\d{1,10}@(enh\\.com|enh\\.in)$";
			//String regex = "^" + firstName + "." + lastName + "\\d*@enh\\.w{3,}$";
			if(email.matches(regex))
			{
				System.out.println("Validated email");
			}
			else
			{
				System.out.println("Not Validated email");
			}
		}
	}
}