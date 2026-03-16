import java.util.Scanner;

public class CajeroAutomatico {

    /*
     * Depositar
     * Retirar
     * Consultar saldo
     * valor inicial 1000
     * 
     */

    double balance = 1000;
    Scanner console = new Scanner(System.in);

    public void deposit() {
        System.out.println("Cuanto dinero desea depositar?");
        double depositAmount = console.nextDouble();
        if (depositAmount <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero." + "\n\n");
        } else {
            balance += depositAmount;
            System.out.println("Deposito exitoso. Su nuevo saldo es: " + balance + "\n\n");
        }

        main(null);
    }

    public void withdraw() {
        System.out.println("Cuanto dinero desea retirar?");
        int withdrawAmount = console.nextInt();

        if (withdrawAmount <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero." + "\n\n");
        } else if (withdrawAmount > balance) {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro." + "\n\n");
        } else {
            balance -= withdrawAmount;
            System.out.println("Retiro exitoso. Su nuevo saldo es: " + balance + "\n\n");
        }

        main(null);
    }

    public void checkBalance() {
        System.out.println("Su saldo actual es: " + balance + "\n\n");

        main(null);
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("""
                   **** Bienvenido al cajero automatico, elige una opcion ****
                    1. Depositar
                    2. Retirar
                    3. Consultar saldo
                    4. Salir
                """);

        int option = console.nextInt();

        switch (option) {
            case 1 -> new CajeroAutomatico().deposit();
            case 2 -> new CajeroAutomatico().withdraw();
            case 3 -> new CajeroAutomatico().checkBalance();
            case 4 -> {
                System.out.println("Saliendo del sistema...");
                console.close();
            }

            default -> System.out.println("Opcion no valida, elige una opcion del menu\n");
        }

    }
}
