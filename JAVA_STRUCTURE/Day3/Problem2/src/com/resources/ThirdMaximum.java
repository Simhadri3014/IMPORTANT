package com.resources;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
  * ThirdMaximum class have the reponsiblity for taking the 
 */
public class ThirdMaximum
{
	private static final Logger logger = LogManager.getLogger(ThirdMaximum.class);
	/**
	  * Finds and prints the 3rd maximum element in the integer array2
	  * @param array2: The array that containing the numbers from which the 3rd maximum will be found
	 */
	public void maximumFinder(int[] array2)
	{
		
		Arrays.sort(array2);
		Set<Integer> distinctSet = new HashSet<>();
		for(int number : array2)
		{
			distinctSet.add(number);
		}
		
		List<Integer> distinctList = new ArrayList<>(distinctSet);
		Collections.sort(distinctList);
		
		logger.info("Distincted sorted numbers are: {}", distinctList);
		
		if(distinctList.size() < 3)
		{
		  logger.warn("Third maximum is not available.");
        }
        else 
        {
            int thirdMax = distinctList.get(distinctList.size() - 3);
            logger.info("Third maximum number is: {}", thirdMax);
        }
	}
}