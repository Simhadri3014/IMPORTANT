import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class HashMapCSV
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			HashMap<Integer , String> object = new HashMap<>();
			for(int i=0 ; i<3 ; i++)
			{
				System.out.println("Enter S.No: ");
				int sNo = Integer.parseInt(bufferedReader.readLine());
				System.out.println("Enter countryName: ");
				String countryName = bufferedReader.readLine();
				object.put(sNo,countryName);
				
			}
			
			System.out.println(object);
			
			FileWriter writer = new FileWriter("CSVFile.csv");
			writer.write("sNo , countryName");
			System.out.println("The data is: ");
			for(Map.Entry<Integer , String> entry : object.entrySet())
			{
				System.out.println();
				System.out.println("sNo: " + entry.getKey() + " countryName:  " + entry.getValue());
			}
			for(Integer key : object.keySet())
			{
				writer.write(key + " , " + object.get(key) + "\n");
			}
			writer.close();
			System.out.println("File created successfully!......");
		}
		catch(IOException exception)
		{
				System.out.print("IOException is occurred: " + exception.getMessage());
				exception.printStackTrace();
		}
		catch(NumberFormatException exception)
		{
			System.out.print("NumberFormatException is occurred: " + exception.getMessage());
		}
	}
}
