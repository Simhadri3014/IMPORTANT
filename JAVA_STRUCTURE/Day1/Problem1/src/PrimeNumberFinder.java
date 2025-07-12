//package Day1.Problem1.src;
//import InputReader;
//import java.util.regex.Pattern;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.lang.NumberFormatException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
  * PrimeNumberFinder is the main class for checking the PrimeNumbers up to the given number
  * It uses the InputReader and Validator class for the userInput and the Validation process
  * Used the log4j2 for the outputs.
  */
public class PrimeNumberFinder
{
	private static final Logger logger = LogManager.getLogger(PrimeNumberFinder.class);
    static InputReader inputReader = new InputReader();
	static Validator validator = new Validator();
	/**
	  * It allows us whether we want to run the program or exit from the code.
	  * When we choose "run" , it takes input as a number and then it finds all the prime numbers less than it.
	  * Used String input      : for taking the input integer.
	         int inputNumber   : gets the in value after validation process.
			 primeNumberFinder : for printing the primenumbers upto the given inputNumber
	  * @param args command line arguments
	  */
	public static void main(String[] args)
    {
	
		while(true)
		{
			logger.info("Choose the option \"run\" to run code and \"exit\" to exit from the code.");				
			String option = inputReader.reader().toLowerCase().trim();
			if(option == null || option.trim().isEmpty())
			{
				logger.warn("\"Null values\" are not acceptable: Please enter the correct input.");
				continue;
			}
			switch(option)
			{
				case "run" :
							System.out.print("Enter a number digit : ");
							String input = inputReader.reader();
							int inputNumber = validator.userInputvalidator(input);
							if(inputNumber > 0)
							{
								primeNumberFinder(inputNumber);
							}
							break;
				case "exit":
							logger.info("Exiting from the Code");
							logger.info("Thank You!..");
							return;
				default    :
							logger.warn("Please choose the correct option either \"run\" or \"exit\" ");
			}
		}	
    }
	/**
	  * For finding all the primeNumbers less than the inputNumber
	  * @param inputNumber : it is the upperLimit number to find all the prime Numbers
	 */
	public static void primeNumberFinder(int inputNumber)
	{
		logger.info("The Prime Numbers are: ");
		for(int number = 2 ; number < inputNumber ; number++)
		{
				if(isPrimeNumber(number))
				{
					//System.out.println(number);
					logger.info(number);
					//logger.info(String.valueOf(number));
				}				
		}
	}
	/**
	  * @param number: it is the number to check whetherit is prime or not
	  * @return true : if it is prime, Otherwise false
	 */
	public static boolean isPrimeNumber(int number)
	{
		if(number < 1) return false;
		for(int range = 2; range < number; range++)
		{
			if(number % range == 0) return false;
		}
		return true;
	}
}