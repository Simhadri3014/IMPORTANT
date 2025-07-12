import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RemoveSpecialChar
{
	public static void main(String[] args)
	{
		System.out.print("Enter input String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(input);
		String result = matcher.replaceAll(" ");
		System.out.println("After replacing special characters: ");
		System.out.println(result);
	}
}