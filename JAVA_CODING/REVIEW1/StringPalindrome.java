import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringPalindrome
 {
   public static void main(String[] args)
    {
      try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in)))
       {
         System.out.println("Enter the input String: ");
         String input=bufferedReader.readLine();
         if(isPalindrome(input))
          {
            System.out.println("Palindrome");
          }
         else
          {
            System.out.println("Not a Palindrome");
          }
       }
      catch(IOException e)
       {
         System.out.println(e);
       }
    }
   public static boolean isPalindrome(String input)
    {
      boolean flag=false;
      String reverse="";
      for(int i=input.length()-1;i>=0;i--)
       {
         reverse=reverse+input.charAt(i);
       }
      System.out.println("The reverse String is: "+reverse);
      if(reverse.equals(input))
       {
         flag=true;
         return flag;
       }
      return flag;
    }
 }