package loops;
import java.util.Scanner;
public class LCMOf2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 number:");
		int input1 = scanner.nextInt();
		System.out.println("Enter input2 number:");
		int input2 = scanner.nextInt();
		int ans = Math.max(input1 , input2);
		while(true)
		{
			if(ans % input1 == 0 && ans % input2 == 0)
			{
				break;
			}
			ans++;
		}
		System.out.println("The LCM of " + input1 + " and " + input2 + " is: " + ans);
	}
}