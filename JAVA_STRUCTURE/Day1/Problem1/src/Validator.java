//package Day1.Problem1.src;
import java.util.regex.Pattern;
//import java.lang.NumberFormatException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
  * Validator class is used to validate the input whether it is a valid input or not using regex
  */
public class Validator
{
	static IntegerFormatValidator formatValidator = new IntegerFormatValidator();
	private static final Logger logger = LogManager.getLogger(Validator.class);
    /**
	  * Validates the input string whether it contains only digits.
	  * @param input: it is to validate a number having range from 0 to 250
	  * @return it returns parsed integer if it is valid &gt; 0 &lt; 250, Otherwise -1
	 */
  
	public int userInputvalidator(String input)
	{
		int inputNumber = -1;
		
		if(!formatValidator.isInteger(input))
		{
			logger.error("Please enter the Integer number only");
			return -1;
		}
		try
		{	
			inputNumber = Integer.parseInt(input);
			if(inputNumber >= 0 && inputNumber <= 500)
			{
				return inputNumber;
			}
			else
			{
				logger.error("Please enter a number between 0 to 500 only ");
				return -1;
			}
		}
		catch(NumberFormatException exception)
		{
			logger.error("Error has occured while parsing the input");
			return -1;
		}
	}
}