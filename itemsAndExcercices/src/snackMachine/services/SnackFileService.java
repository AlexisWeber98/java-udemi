package snackMachine.services;

import snackMachine.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SnackFileService implements  ISnacksService {

    private final String FILE_NAME = "snacks.txt";
    private List<Snack> snacks = new ArrayList<>();


    public SnackFileService() {
        // Cargar los snacks desde el archivo al iniciar el servicio
        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();

        try {
            if (fileExists){
                //this.snaks = loadSnacksFromFile();
            } else {

                PrintWriter outputFile = new PrintWriter(new FileWriter(file));
                outputFile.close(); //fundamental para crear el archivo, si no se cierra el flujo de salida, el archivo no se crea
                System.out.println("¡The file was created successfully!");
            }

        } catch (Exception exception) {
            System.out.println("An error occurred while loading snacks: " + exception.getMessage());
             exception.printStackTrace();
        }

        if (!fileExists){
            loadInitialSnacks();
        }
    }

    private void loadInitialSnacks() {
this.addSnack(new Snack("papas", 2.5));
this.addSnack(new Snack("gaseosa", 4));
this.addSnack(new Snack("chocolate", 3));
    }


    @Override
    public void addSnack(Snack snack) {
        // agregamos a la lista de snacks en memoria
        this.snacks.add(snack);
        // guardamos el nuevo snack en el archivo
        this.addSnackToFile(snack);
    }

    public void addSnackToFile(Snack snack){
        boolean append = false;
        File file = new File(FILE_NAME);

        try {
            append = file.exists();
            PrintWriter outputFile = new PrintWriter(new FileWriter(file, append));
            outputFile.println(snack);
            outputFile.close();
        }catch (Exception exception) {
            System.out.println("An error occurred while writing to the file: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @Override
    public void showSnacks() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
