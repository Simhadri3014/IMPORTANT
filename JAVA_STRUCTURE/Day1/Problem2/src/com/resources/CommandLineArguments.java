package com.resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
  * CommandLineArguments class is performing the taking the inputs from the commandline and 
  * concatenate it then printing them
  * Using log4j for the logging
 */
public class CommandLineArguments
{
	private static final Logger logger = LogManager.getLogger(CommandLineArguments.class);
	/**
	  * taking the arguments from the commandline and append them and printing it
	  * @param arguments: command line arguments
	 */
	public static void main(String[] arguments)
	{
	
		if(arguments.length == 0)
		{
			logger.warn("Null inputs are not acceptable: Please enter the correct input");
		}
		else
		{
			StringBuilder stringBuilder = new StringBuilder();
			logger.info("The inputs are: ");
			for(String argument : arguments)
			{
				stringBuilder.append(argument).append(" ");
				
			}
			logger.info(stringBuilder.toString().trim());
		}
		
	}
}