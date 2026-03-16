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
                """);
        while (userGuess != secretNumber) {

            System.out.println("Intento número: " + (attempts + 1));
            System.out.println("Ingresa tu suposición:");
            userGuess = console.nextInt();
            attempts++;

        }
        console.close();
        System.out.println("¡Felicidades! Adivinaste el número secreto en " + attempts + " intentos.");

    }
}
