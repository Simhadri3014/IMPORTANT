import java.io.*;
class CreatingFile
{
 public static void main(String[] rargs) throws IOException
 {
  File file=new File("O:/JavaPractice/FileHandling/File.txt");
  file.createNewFile();
  System.out.println("Success.....");
 }
}