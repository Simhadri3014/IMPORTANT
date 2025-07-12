import java.util.Scanner;
class PyramidPalindrome
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		for(int i = 0 ; i < input ; i++)
		{
			for(int space = i ; space < input ; space++)
			{
				System.out.print(" ");
			}
			int a = 0 , b = 1, c = 1;
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print(a+" ");
				//System.out.print(b);
				//System.out.print(c);
				c = a+b;
				a = b;
				b = c;
				
			}
			System.out.println();
		}
	}
}