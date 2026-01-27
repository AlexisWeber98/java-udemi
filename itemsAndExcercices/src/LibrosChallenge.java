import java.util.*;

public class LibrosChallenge {
    public static void main(String[] args) {
        System.out.println("Prestamo de libros");

        final int MAX_DISTANCE = 3;
        int distanceToLibrary;
        boolean hasMembership;

        Scanner console = new Scanner(System.in);

        System.out.println("Ingrese la la distancia de su domicilio a la biblioteca en Km:");

        distanceToLibrary = Integer.parseInt(console.nextLine().trim());

        System.out.println("Cuenta con membresia activa? (true/false):");

        hasMembership = Boolean.parseBoolean(console.nextLine().trim());

        console.close();

        System.out
                .println(
                        "es apto para el prestamo de libros?  " + (hasMembership || distanceToLibrary <= MAX_DISTANCE));
    }
}
