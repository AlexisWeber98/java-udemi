package files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("Reading the file: ");
           // for (String line : lines) {
             //   System.out.println(line);
            //}

            lines.forEach(System.out::println);

    } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
                throw new RuntimeException(e);
        }}
}
