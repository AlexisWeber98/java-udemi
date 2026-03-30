package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        var fileName  = "myFile.txt";
        File file = new File(fileName);
        try {

            System.out.println("Reading the file: ");

            var openAndRead = new BufferedReader(new FileReader(file));

            // leemos lina a linea al archivo

            String line = openAndRead.readLine();

            System.out.println("first Line read: " + line);

            // leemos el archivo completo (todas las lineas)

            while (line != null){
                System.out.println(line);
                line = openAndRead.readLine();
            }

            openAndRead.close();

        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
