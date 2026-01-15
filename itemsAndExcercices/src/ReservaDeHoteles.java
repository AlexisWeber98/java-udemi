public class ReservaDeHoteles {
    public static void main(String[] args) {
        System.out.println(" ***** Reserva de Hoteles ***** ");

       String nombreCliente = "Carlos Sánchez";
       int diasDeEstadia = 5;
         double costoPorNoche = 120.50;
         boolean tieneVistaMar = true;

            System.out.println("Nombre del Cliente: " + nombreCliente);
            System.out.println("Días de Estadia: " + diasDeEstadia);
            System.out.println("Costo por Noche: " + costoPorNoche);
            System.out.println("Tiene Vista al Mar: " + tieneVistaMar);


        System.out.println("--- Actualizando Reserva ---");
        tieneVistaMar = false;
        costoPorNoche = 100.75;
        diasDeEstadia = 7;
        System.out.println("Días de Estada Actualizados: " + diasDeEstadia);
        System.out.println("Costo por Noche Actualizado: " + costoPorNoche);
        System.out.println("Tiene Vista al Mar Actualizado: " + tieneVistaMar);

    }
}
