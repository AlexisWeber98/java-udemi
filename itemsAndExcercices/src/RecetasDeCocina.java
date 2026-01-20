import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println(" ------- Receetas de Cocina ------- ");

        var console = new Scanner(System.in);

        System.out.print("Introduce el nombre de la receta: ");
        var nombreReceta = console.nextLine();

        System.out.println("Ingresa los ingreredientes de la receta (separados por comas): ");
        var ingredientes = console.nextLine();

        System.out.print("Introduce el tiempo de preparacion (en minutos): ");
        var tiempoPreparacion = Integer.parseInt(console.nextLine());

        System.out.print("Introduce el nivel de dificultad: ");
        var nivelDificultad = console.nextLine();

        console.close();

        System.out.println("\n--- Detalles de la Receta ---");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.printf("Tiempo de preparacion: %d minutos%n", tiempoPreparacion);
        System.out.println("Nivel de dificultad: " + nivelDificultad);
    }
}
