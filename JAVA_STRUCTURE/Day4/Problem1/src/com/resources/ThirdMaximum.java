package com.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ThirdMaximum class is responsible for printing every third element
 * from the validated user input array.
 */
public class ThirdMaximum
 {
    private static final Logger logger = LogManager.getLogger(ThirdMaximum.class);
    /**
     * Prints every third element from the input array.
     *
     * @param array2 the validated array of user inputs
     */
    public void maximumFinder(String[] array2)
	{
        if (array2 == null || array2.length < 3)
		{
            logger.error("Input array must have at least three elements.");
            return;
        }
        logger.info("Every third element in the array is:");
        for (int i = 2; i < array2.length; i += 3)
		{
            logger.info(array2[i]);
        }
    }
}
