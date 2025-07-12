package com.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * StringComparing is the main class that drives the application.
 * It allows the user to run the program or exit, and coordinates
 * input validation and output display.
 */
public class StringComparing
 {
    private static final Logger logger = LogManager.getLogger(StringComparing.class);
    static ThirdMaximum thirdMaximum = new ThirdMaximum();
    static InputReader inputReader = new InputReader();
    static Validator validator = new Validator();

    /**
     * Main method to run the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
	{
        while (true) 
		{
            logger.info("Choose the option \"run\" to run code and \"exit\" to exit from the code.");
            String option = inputReader.reader();

            if (option == null || option.trim().isEmpty())
			{
                logger.warn("\"Null values\" are not acceptable: Please enter the correct input.");
                continue;
            }
            option = option.toLowerCase().trim();
            switch (option) 
			{
                case "run":
							String[] array2 = validator.userInputvalidator();
							if (array2 != null)
							{
								thirdMaximum.maximumFinder(array2);
							}
							else 
							{
								logger.error("Invalid array input is received");
							}
							break;
                case "exit":
							logger.info("Exiting from the Code");
							logger.info("Thank You!..");
							return;
                default:
							logger.warn("Please choose the correct option either \"run\" or \"exit\" ");
            }
        }
    }
}
