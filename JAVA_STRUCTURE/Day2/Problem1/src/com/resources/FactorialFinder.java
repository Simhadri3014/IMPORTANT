package com.resources;
import com.resources.Validator;
import com.resources.InputReader;
import com.resources.IntegerFormatValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class FactorialFinder
{   /**
      * FactorialFinder is the main class for checking the PrimeNumbers up to the given number
	  * Handles the scenario when the user enters an invalid option
	  * Logs warning a message indicating valid choices    
	  * It uses the InputReader and Validator class for the userInput and the Validation process
      * Used the log4j2 for the outputs.
      */
	private static final Logger logger = LogManager.getLogger(FactorialFinder.class);
	static InputReader inputReader = new InputReader();
	static Validator validator = new Validator();
	/**

	  * It allows us whether we want to run the program or exit from the code.
	  * When we choose "run" , it takes input as a number and then it finds all the factors of the given number
	  * Used String input      : for taking the input integer.
	         int inputNumber   : gets the in value after validation process.
	  *		 factors[]         : for storing the factors
	  * @param args command line arguments
	  */
	public static void main(String[] args)
	{
		while(true)
		{
			logger.info("Choose the option \"run\" to run code and \"exit\" to exit from the code");
		    String option = inputReader.reader().toLowerCase().trim();
			if(option == null || option.trim().isEmpty())
			{
				logger.warn("\"Null Values\" are not acceptable: So please enter the correct input ");
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
								factorsFinder(inputNumber);
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
	  * For printing the factors of a given number
	  * @param inputNumber : it is the upperLimit number to find all the factors
	 */
	public static void factorsFinder(int inputNumber)
	{
		int[] factors = findFactors(inputNumber);
		logger.info("Thee factors for the " + inputNumber + "are :");
		for(int factor : factors)
		{
			if(factor != 0)
			{
				logger.info(factor);
			}
		}
	}
	/**
	  * @param inputNumber: it is the inputNumber for checking the factors of it.
	  * @return factors : return the array of integer type of factors
	 */
	public static int[] findFactors(int inputNumber)
	{
		int[] factors = new int[inputNumber];
		int indexPosition = 0;
		for(int range = 1 ; range <= inputNumber ; range++)
		{
			if(inputNumber % range == 0)
			{
				factors[indexPosition++] = range;
			}
		}
		return factors;
	}
	
}