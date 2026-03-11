import java.util.Scanner;

public class IterativeMenu {
    public static void main(String[] args) {

        int option = 0;

        Scanner console = new Scanner(System.in);

        while (option != 3) {

            System.out.println("""
                        **** Bienvenido al menu de iterativos, elige una opcion ****
                        1. Crear cuenta
                        2. Eliminar cuenta
                        3. Salir
                        Elige una opcion:
                    """);

            option = console.nextInt();

            switch (option) {
                case 1 -> System.out.println("Creando cuenta... \n");

                case 2 -> System.out.println("Eliminando cuenta...\n");

                case 3 -> System.out.println("Saliendo del menu... \n");

                default -> System.out.println("Opcion no valida, elige una opcion del menu\n");
            }
        }
        console.close();
    }
}
