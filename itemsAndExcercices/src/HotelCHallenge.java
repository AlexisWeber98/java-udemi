import java.util.Scanner;

public class HotelCHallenge {

    /*
     * crear un sistema de reserva de hotel
     * pedir: nombre de cliente, dias de estadia y cuarto con vista al mar
     * 
     * ----------------------------------------------------------------------
     * traifas del hotel
     * con vista al mar: 190.00 x dia
     * sin vista al mar: 150.50 x dia
     * 
     * -----------------------------------------------------------------------
     * calcular costo toltal de estadía
     * dependiendo de si escogio con o sin vista al mar
     * mostrar mensaje de confirmacion de reserva con el nombre del cliente y el
     * costo total
     */

    public static void main(String[] args) {

        final double COSTO_VISTA_MAR = 190.00;
        final double COSTO_SIN_VISTA_MAR = 150.50;
        String name;
        Double finalCost;
        int days;

        System.out.println(" ***** Sistema de Reserva de Hotel ***** ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del cliente: ");
        name = scanner.nextLine();

        System.out.println("Ingresa los dias de estadiPepea: ");
        days = scanner.nextInt();

        System.out.println("¿Desea una habitacion con vista al mar? (true/false): ");
        boolean vistaMar = scanner.nextBoolean();

        scanner.close();
        finalCost = vistaMar ? COSTO_VISTA_MAR * days : COSTO_SIN_VISTA_MAR * days;

        System.out.println("Reserva confirmada para " + name + ". Costo total: $" + finalCost);
    }
}