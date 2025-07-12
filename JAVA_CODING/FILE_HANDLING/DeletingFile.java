import java.io.*;
class DeletingFile
{
 public static void main(String[] rargs) throws IOException
 {
  File file=new File("O:/JavaPractice/FileHandling/File.txt");
  file.delete();
  System.out.println("Success.....");
 }
}