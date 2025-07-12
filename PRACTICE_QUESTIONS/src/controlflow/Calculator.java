package controlflow;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an operator \" + , - , * , ^ , % , / \"");
		double result;
		char operator = scanner.next().charAt(0);
		
		System.out.println("Enter the input1: ");
		double input1 = scanner.nextDouble();
		
		System.out.println("Enter the input2: ");
		double input2 = scanner.nextDouble();
		
		switch(operator)
		{
			case '+' : 	result = input1 + input2;
						System.out.println("input1 + input2: " + result);
						break;
			case '-' : 	result = input1 - input2;
						System.out.println("input1 - input2: " + result);
						break;
			case '*' : 	result = input1 * input2;
						System.out.println("input1 * input2: " + result);
						break;
			case '^' : 	result = Math.pow(input1 , input2);
						System.out.println("input1 ^ input2: " + result);
						break;
			case '%' : 	result = input1 % input2;
						System.out.println("input1 % input2: " + result);
						break;
			case '/' : 
						if(input2 !=0)
						{
							result = input1 / input2;
							System.out.println("input1 / input2: " + result);
						}	
						else
						{
							System.out.println("Invalid input! Please enter the correct input2");
						}
						break;
			default  :	System.out.println("Invalid operator! please enter the correct operator");
						break;    
		}
	}
}