import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        // si no se desea salir del sistema, imprimir "continuamos dentro del sistema"
        // si se desea salir, imprimir "saimos del sistema"

        Scanner console = new Scanner(System.in);

        System.out.println("Do you want continue in the system? (true/false)");
        boolean continueInSystem = console.nextBoolean();

        console.close();

        if (!continueInSystem) {
            System.out.println(" we exit the system");

        } else {
            System.out.println("we continue in the system");
        }
    }
}
