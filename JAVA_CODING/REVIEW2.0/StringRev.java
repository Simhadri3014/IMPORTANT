class StringRev
{
  public static void main(String[] args)
  {
    String input = "Hello World";
    String[] array = input.split(" ");
    for(int i = 0 ; i < array.length ; i++)
    {
      String string = array[i];
      reverse(string);
    }
  }
  public static void reverse(String string)
  {
    for(int i=string.length()-1 ; i>=0 ; i--)
    {
      System.out.print(string.charAt(i));
    }
    System.out.print(" ");
  }
}