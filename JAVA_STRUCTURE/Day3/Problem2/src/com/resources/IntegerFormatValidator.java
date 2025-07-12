package com.resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.NumberFormatException;
/**
  * IntegerFormatValidator class checks whether the input is integer or or not
 */
public class IntegerFormatValidator
{
	private static final Logger logger = LogManager.getLogger(IntegerFormatValidator.class);
	/**
	  * Validates whether the range is integer or not
	  * @param input: is to validate whether it is an integer or not
	  * @return it returns an number if it is the Valid Integer, Otherwise -1 
	 */
	public boolean isInteger(String input)
	{
		try
		{
			Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException exception)
		{
			logger.error("NumberFormatException is occured");
			return false;
		}
        catch(NullPointerException exception)
        {
			logger.info("NullPointerException occured");
			return false;
		}		
	}
}