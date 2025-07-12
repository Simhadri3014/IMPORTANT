import java.io.FileInputStream;  
import java.io.IOException;  
 class FileInputStreamExample {  
    public static void main(String[] args) {  
        // Specify the file name to open  
        String fileName = "O:/JavaPractice/Input&Output/FileInputStream/FileInputStream.txt";  
        // Try-with-resources statement to ensure the FileInputStream is closed after  
        // use  
        try (FileInputStream fis = new FileInputStream(fileName)) {  
            int i;  
            // Read one byte at a time until the end of the file is reached  
            while ((i = fis.read()) != -1) {  
                // Convert the byte to a char and print it  
                System.out.print((char) i);  
            }  
        } catch (IOException e) {  
            // Handle exceptions, such as FileNotFoundException  
            e.printStackTrace();  
        }  
    }  
}  