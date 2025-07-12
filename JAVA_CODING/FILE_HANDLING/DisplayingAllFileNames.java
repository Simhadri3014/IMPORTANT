import java.io.*;  
public class DisplayingAllFileNames {  
public static void main(String[] args) {  
    File f=new File("O:/");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename+" " +filename.length());  
    }  
}  
}  