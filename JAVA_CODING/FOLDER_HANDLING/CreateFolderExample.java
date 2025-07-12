import java.io.File;
public class CreateFolderExample
{
 public static void main(String[] args)
 {
  // Ikkada path ni meeku kavalsina location ki set cheyyandi
  String folderPath = "O:/JavaPractice/Folders/NewFolder";
  // File object create chesthunnam
  File folder = new File(folderPath);
  // Folder already unda leda ani check chesthunnam
  if (!folder.exists()) 
  {
   // Folder create cheyyadam
   boolean created = folder.mkdir(); 
   // mkdirs() use cheyyachu if parent folders kuda lekapote
   if (created)
   {
    System.out.println("Folder create ayyindi!");
   }
   else
   {
    System.out.println("Folder create cheyyadam fail ayyindi.");
   }
  }
  else
  {
   System.out.println("Folder already undi.");
  }
 }
}
