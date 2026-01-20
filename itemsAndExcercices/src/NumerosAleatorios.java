import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println(" ------- Números Aleatorios ------- ");

        Random numero = new Random();

        // Generar numero aleatorio entre 0 y 9

        int randomNumber = numero.nextInt(10);
        System.out.println("Número aleatorio: " + randomNumber);

        // generar un aleatorio entre 1 y 10

        randomNumber = numero.nextInt(10) + 1;
        System.out.println("Número aleatorio entre 1 y 10: " + randomNumber);

        // generar numero flotante entre 0.0 y 1.0

        float randomFloat = numero.nextFloat();

        System.out.println("Número aleatorio flotante entre 0.0 y 1.0: " + randomFloat);

        // simular el lanzamiento de un dado de 6 caras

        int dado = numero.nextInt(6) + 1;

        System.out.println("Lanzamiento de un dado de 6 caras: " + dado);
    }
}
