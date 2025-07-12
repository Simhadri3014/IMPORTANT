package loops;
import java.util.Scanner;
public class Armstrong1toN
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 number:");
		int input = scanner.nextInt();
		for(int i = 1 ; i < input ; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}	
	}
	public static boolean isArmstrong(int value)
	{
		int temp = value , sum =0;
		while(value > 0)
		{
			int rem = value % 10;
			sum = sum + rem * rem * rem;
			value = value / 10;
		}
		if(sum == temp) return true;
		return false;
	}
}