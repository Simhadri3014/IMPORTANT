import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File("MyFolder");
        String[] files = folder.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
