package basics;
import java.util.Scanner;
public class CharacterVowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input character: ");
		char input = scanner.next().charAt(0);
		if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') System.out.println(input + " is a Vowel");
		else if(Character.isLetter(input)) System.out.println(input + " is a consonant");
	}
}