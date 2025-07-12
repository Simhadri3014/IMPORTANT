import java.util.Scanner;
public class SpecialString
{
  public static void main(String[] args)
   {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the String ");
     String input=scanner.nextLine();
     String modified=input.replaceAll("[!@#$%^&*()]"," ");
     System.out.println("The modified string is: "+modified);
   }
}