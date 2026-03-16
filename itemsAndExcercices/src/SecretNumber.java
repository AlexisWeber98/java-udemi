import java.util.Random;
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner console = new Scanner(System.in);

        int secretNumber = random.nextInt(50) + 1; // Número aleatorio entre 1 y 50

        int userGuess = 0;
        int attempts = 0;

        System.out.println("""
                    ---------- ¡Bienvenido al juego de adivinar el número secreto! ----------
                    *** Adivina un número entre 1 y 50.

                    Tienes 10 intentos para adivinar el número secreto. ¡Buena suerte! ***
                """);
        while (userGuess != secretNumber && attempts < 10) {

            System.out.println("Intento número: " + (attempts + 1));
            System.out.println("Ingresa tu suposición:");
            userGuess = console.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else if (userGuess > secretNumber) {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }

        }
        console.close();
        if (userGuess == secretNumber) {
            System.out.println("¡Felicidades! Adivinaste el número secreto en " + attempts + " intentos.");
        } else {
            System.out.println("Lo siento, no adivinaste el número secreto. Era: " + secretNumber);
        }

    }
}
