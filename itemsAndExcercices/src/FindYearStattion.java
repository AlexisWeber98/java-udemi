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

        
        switch (month) {
            case 1, 2, 12 -> System.out.println("Es verano");
            case 3, 4, 5 -> System.out.println("Es otono");
            case 6, 7, 8 -> System.out.println("Es invierno");
            case 9, 10, 11 -> System.out.println("Es primavera");
            default -> System.out.println("Mes no valido");
        }

    }
}
