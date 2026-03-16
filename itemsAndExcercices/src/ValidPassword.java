import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println("Ingresa una contraseña (a menos 6 caracteres):");

        Scanner console = new Scanner(System.in);

        String password = console.nextLine();

        boolean isValid = false;
        while (isValid == false) {
            if (password.length() < 6) {
                System.out.println("Contraseña no válida. Intenta de nuevo:");
                password = console.nextLine();
            } else {
                System.out.println("Contraseña válida.");
                isValid = true;
            }
        }

        console.close();
    }

}
