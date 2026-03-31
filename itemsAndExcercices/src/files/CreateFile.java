package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        String myFile = "myFile.txt";

        File file = new File(myFile);
        try {
            if(file.exists()){
              System.out.println("!!! ----- The file already exists ----- !!!");

            } else {
                 var output = new PrintWriter(new FileWriter(file));
                output.close(); //fundamental para crear el archivo, si no se cierra el flujo de salida, el archivo no se crea
                System.out.println("¡The file was created successfully!");
           }
        } catch(IOException exception){
        System.out.println("An error occurred while creating the file: " + exception.getMessage());
        exception.printStackTrace();
        }
    }
}
