package com.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Validator class handles user input validation and ensures that
 * all values in the array are pure strings (alphabetic only).
 */
public class Validator
 {
    IntegerFormatValidator formatValidator = new IntegerFormatValidator();
    static InputReader inputReader = new InputReader();
    private static final Logger logger = LogManager.getLogger(Validator.class);

    /**
     * Reads and validates an array of user inputs.
     * All inputs must be pure strings (only alphabetic characters).
     *
     * @return a validated array of strings or null if validation fails
     */
    public String[] userInputvalidator() 
	{
        logger.info("Enter the size of the array:");
        String inputArraySize = inputReader.reader();

        // Validate array size using regex for digits only
        if (!formatValidator.isNonEmptyString(inputArraySize) || !inputArraySize.matches("\\d+"))
		{
            logger.warn("Invalid array size! Must be a non-empty positive integer.");
            return null;
        }

        int arraySize = Integer.parseInt(inputArraySize);
        if (arraySize < 3)
		{
            logger.warn("Array size must be at least 3.");
            return null;
        }

        String[] array = new String[arraySize];
        logger.info("Enter " + arraySize + " string values (only alphabets):");

        for (int i = 0; i < arraySize; i++)
		{
            String input = inputReader.reader();

            if (!formatValidator.isNonEmptyString(input)) 
			{
                logger.warn("Empty input. Please enter a valid string.");
                i--;
                continue;
            }

            if (!formatValidator.isPureString(input))
			{
                logger.warn("Invalid input. Please enter only alphabetic characters (no numbers or symbols).");
                i--;
                continue;
            }
            array[i] = input;
        }

        return array;
    }
}
