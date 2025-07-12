package com.resources;

/**
 * IntegerFormatValidator class provides methods to validate
 * non-empty and pure alphabetic string inputs.
 */
public class IntegerFormatValidator
 {

    /**
     * Checks if the input string is non-empty and not null.
     *
     * @param input the input string to validate
     * @return true if the input is non-empty, false otherwise
     */
    public boolean isNonEmptyString(String input)
	{
        return input != null && !input.trim().isEmpty();
    }

    /**
     * Checks if the input string contains only alphabetic characters.
     *
     * @param input the input string to validate
     * @return true if the input is a pure string, false otherwise
     */
    public boolean isPureString(String input) 
	{
        return input != null && input.matches("^[a-zA-Z]+$");
    }
}
