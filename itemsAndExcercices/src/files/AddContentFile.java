package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class AddContentFile {
    public static void main(String[] args) {
        boolean append = false;

        String fileName = "myFile.txt";
        File file = new File (fileName);

        try{

         append = file.exists();

         PrintWriter outFile = new PrintWriter(new FileWriter(file, append));


         String newContent = "New\nContent\nMaaaaaan\n";
         outFile.println(newContent);
         outFile.close();

            System.out.println("Content added successfully to the file.");

        } catch(Exception exception){
            System.out.println("An error occurred while writing to the file: " + exception.getMessage());

        }

    }
}
