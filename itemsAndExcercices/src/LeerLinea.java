import java.util.Scanner;

public class LeerLinea {
    public static void main(String[] args) {
        // introducir datos por consola
        var userInput = new Scanner(System.in);

        System.out.print("Escribe tu nombre Rey: ");

        var name = userInput.nextLine();

        System.out.print("Jelow " + name);
        userInput.close();
    }
}