import java.util.Scanner;

public class PairFunction {
    static boolean isPair(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es par o impar:");

        int number = console.nextInt();
        console.close();

        System.out.println("el numero es par?: " + isPair(number));
    }

}
