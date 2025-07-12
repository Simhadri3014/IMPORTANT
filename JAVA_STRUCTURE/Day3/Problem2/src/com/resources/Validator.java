package com.resources;
import com.resources.InputReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
  * Validator class is used to validate the input whether it is a valid input or not
  * and stores them into an integer array
  * It reads 10 numbers from the user, validates them, and returns the validated integer array
  */
public class Validator
{
    IntegerFormatValidator formatValidator = new IntegerFormatValidator();
	static InputReader inputReader = new InputReader();
	private static final Logger logger = LogManager.getLogger(Validator.class);
    
  /**
	  * It reads 10 numbers from the user, validates them, and returns the validated array
	  * @return : The validated integer array containing user inputs
	 */
	public int[] userInputvalidator()
	{
		int[] array = new int[10];
		logger.info("Enter the 10 numbers in an array: ");
		for(int range = 0 ; range < 10 ; range++)
		{
			int value = 0;
			String input = inputReader.reader();
			if(!formatValidator.isInteger(input))
			{	
				logger.error("Please Enter the Integer Number only");
				range--;
				continue;
				//array[range] = Integer.parseInt(formatValidator.validate(range));
			}
			try
			{
				value = Integer.parseInt(input);
				array[range] = value;
			}
			catch(Exception exception)
			{
				logger.error("InputMismatchException: Please enter the Integer only");
				range--;
			}			
		}
		return array;
	}
}