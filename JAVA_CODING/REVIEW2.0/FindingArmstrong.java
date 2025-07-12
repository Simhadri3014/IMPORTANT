import java.util.Scanner;
public class FindingArmstrong
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input number: ");
		int input = scanner.nextInt();
		int count = 0;
		for(int num = 1 ; num <= input ; num++)
		{
			int rem , sum =0;
			int temp = num;
			int n = num;
			while(n > 0)
			{
				rem = n % 10;
				sum = sum + (rem * rem * rem);
				n = n / 10;
			}
			if(sum == temp)
			{
				System.out.println(temp);
				count++;
			}
		}
		System.out.println("Total armstrong numbers are: " + count);
	}
}