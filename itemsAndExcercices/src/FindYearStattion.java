import java.util.Scanner;

public class FindYearStattion {

    public static void main(String[] args) {

        /*
         * identificar la estacion del año
         * el usuario indicara el mes (valor numerico de 1 - 12)
         * meses 1, 2, 12: verano
         * meses 3, 4, 5: otono
         * meses 6, 7, 8: invierno
         * meses 9, 10, 11: primavera
         */

        int month;

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes (1 - 12): ");
        month = console.nextInt();

        console.close();
        if (month < 1 || month > 12)
            System.out.println("Mes no valido");

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Es verano");

        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Es otono");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Es invierno");
        } else {
            System.out.println("Es primavera");
        }
    }
}
