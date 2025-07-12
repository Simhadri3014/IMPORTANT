package com.resources;
import com.resources.Validator;
import com.resources.InputReader;
import com.resources.ThirdMaximum;
import com.resources.IntegerFormatValidator;
import java.lang.NumberFormatException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
  * MaximumFinder is the main class for printing the 3rd maximum number in list of 10 numbers
  * It uses the InputReader and Validator class for the userInput and the Validation process
  * Used the log4j2 for the outputs.
  */
public class MaximumFinder
{
	private static final Logger logger = LogManager.getLogger(MaximumFinder.class);
	static ThirdMaximum thirdMaximum = new ThirdMaximum();
    static InputReader inputReader = new InputReader();
	static Validator validator = new Validator();
	/**
	  * It allows us whether we want to run the program or exit from the code.
	  * When we choose "run" , it takes input as a number and then it finds the 3rd maximum number in a list of 10 numbers.
	  * Used String input      : for taking the input integer.
	         int inputNumber   : gets the in value after validation process.
	  * @param args command line arguments
	  */
	public static void main(String[] args)
    {
	
		while(true)
		{
			logger.info("Choose the option \"run\" to run code and \"exit\" to exit from the code.");				
			String option = inputReader.reader().toLowerCase().trim();
			if(option == null || option.isEmpty())
			{
				logger.warn("\"Null values\" are not acceptable: Please enter the correct input.");
				continue;
			}
			switch(option)
			{
				case "run" :
				            try
							{
								int[] array2 = validator.userInputvalidator();

								thirdMaximum.maximumFinder(array2);
								break;		
							}
							catch(NullPointerException exception)
							{
								logger.error("NullPointerException occured: Inputarray is null", exception);
								return;
							}
		
				case "exit":
							logger.info("Exiting from the Code");
							logger.info("Thank You!..");
							return;
				default    :
							logger.warn("Please choose the correct option either \"run\" or \"exit\" ");
			}
		}	
    }

}