import java.util.Scanner;

public class NewAuthSistemChallenge {
    public static void main(String[] args) {

        /*
         * Crear un sistema parta validar los valores de usuario y password
         * se deben definir dos constantes con los valores validaos:
         * se deben considerar 4 casos:
         * 1. si el usuario y password son correctos imprimir "Bienvenido al sistema"
         * 2. si el usuario es correcto pero el password es incorrecto imprimir
         * "Password incorrecto"
         * 3. si el usuario es incorrecto pero el password es correcto imprimir
         * "Usuario incorrecto"
         * 4. si el usuario y password son incorrectos imprimir
         * "Usuario y password incorrectos"
         */

        String USERNAME = "Alexis@admin";
        String PASSWORD = "Al3xi5Adm1n";

        String userNameInput = "";
        String passwordInput = "";

        Scanner console = new Scanner(System.in);
        System.out.println(" ------ please enter your username ------ ");
        userNameInput = console.nextLine();

        System.out.println(" ------ please enter your password ------ ");
        passwordInput = console.nextLine();
        console.close();

        userNameInput = userNameInput.trim();
        passwordInput = passwordInput.trim();

        if (userNameInput.equals(USERNAME) && passwordInput.equals(PASSWORD)) {
            System.out.println("Bienvenido al sistema");
        } else if (userNameInput.equals(USERNAME)) {
            System.out.println("Password incorrecto");
        } else if (passwordInput.equals(PASSWORD)) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Usuario y password incorrectos");
        }

    }
}
