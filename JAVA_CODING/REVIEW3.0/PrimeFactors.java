import java.util.Map;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class PrimeFactors
{
/**
  * We can use either HashMap or L inkedHashMap.
  * LinkedHashMap maintains insertion order. But it has the slower performance than HashMap.
  * HashMap doesn't maintains insertion order. It has faster performance.
  */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int input = scanner.nextInt();
		System.out.println("The Prime Factors are: ");
		Map<Integer , Integer> object = new LinkedHashMap<>();
		
		while(input % 2 ==0)
		{
			object.put(2 , object.getOrDefault(2 , 0) + 1);
			input = input / 2;
		}
		for(int range = 3 ; range <= input ; range+=2)
		{
			while(input % range == 0)
			{
				object.put(range , object.getOrDefault(range , 0) + 1);
				input = input / range;
			}
		}
		if(input > 2)
		{
			object.put(input, 1);
		}
		for(Map.Entry<Integer , Integer> entry : object.entrySet())
		{
			System.out.print(entry.getKey() + "^" + entry.getValue() + " ");
		}
		
	}
}