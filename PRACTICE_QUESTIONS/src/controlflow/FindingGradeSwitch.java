package controlflow;
import java.util.Scanner;
public class FindingGradeSwitch
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int input = scanner.nextInt();
		int grade = input/10;
		switch(grade)
		{
			case 10: System.out.println("Out OFf.. A-Grade");
					 break;
			case 9 : System.out.println("A - Grade");
					 break;
			case 8 : System.out.println("B - Grade");
					 break;
			case 7 : System.out.println("C - Grade");
					 break;
			case 6 : System.out.println("D - Grade");
					 break;
			case 5 : System.out.println("E - Grade");
					 break;
			default : System.out.println("Fail!.... Better luuck next time");
			
		}
	}
}