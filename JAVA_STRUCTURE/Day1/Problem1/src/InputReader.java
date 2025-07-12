//package Day1.Problem1.src;
//package Day1.Problem1.src;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
  * InputReader class have the reponsiblity for reading the input from the user
 */
public class InputReader
{
	private static final Logger logger = LogManager.getLogger(InputReader.class);
	/**
	  * reader() method describes about reading a line from the console
	  
	  * @return It returns the input string from the user
	  * and null if an IOException ocuurs
	 */
	
	public String reader()
	{
		try
		{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		    return bufferedReader.readLine();
		}
		catch(IOException exception)
		{
			logger.error("IOException is occured", exception.getMessage());
			return null;
		}
	}
}