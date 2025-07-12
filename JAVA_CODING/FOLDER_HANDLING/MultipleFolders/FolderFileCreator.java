import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FolderFileCreator
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  String basePath = "O:\\JavaPractice\\Folders\\MultipleFolders";
  
  System.out.println("Enter the Folder name");
  String name =input.nextLine(); 

  System.out.println("Enter the text file name");
  String fileName =input.nextLine();
  
  System.out.println("Enter the text file content");
  String fileContent =input.nextLine();

  for (int i = 1; i <= 100; i++)
  {
   String folderName = name + i;
   File folder = new File(basePath + "\\" + folderName);
   if (!folder.exists())
   {
    folder.mkdirs();
   }
   File file =    new File(folder, fileName);
   try (FileWriter writer = new FileWriter(file))
   {
    writer.write(fileContent);
    System.out.println(file.getPath() + " created.");
   }
   catch (IOException e)
   {
    System.out.println("Error writing to file: " + file.getPath());
    e.printStackTrace();
   }
  }
 }
}
