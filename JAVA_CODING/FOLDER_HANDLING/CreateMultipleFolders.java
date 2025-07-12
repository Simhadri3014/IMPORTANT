import java.io.File;
public class CreateMultipleFolders
{
 public static void main(String[] args)
 {
  // Base path
  String basePath = "O:/JavaPractice/Folders";
  // Loop to create folders like NewFolder1, NewFolder2, NewFolder3
  for (int i = 1; i <= 5; i++)
  {
   String folderName = "NewFolder " + i;
   String fullPath = basePath + "/" + folderName;
   File folder = new File(fullPath);
   if (!folder.exists())
   {
    boolean created = folder.mkdirs();
    if (created)
    {
     System.out.println(folderName + " create ayyindi.");
    }
    else
    {
     System.out.println(folderName + " create cheyyadam fail ayyindi.");
    }
   }
  else
   {
    System.out.println(folderName + " already undi.");
   }
  }
 }
}
