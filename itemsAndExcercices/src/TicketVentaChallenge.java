import java.util.*;

public class TicketVentaChallenge {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double precioLeche;
        double precioPan;
        double precioLechuga;

        double subTotal;
        double total;
        double impuesto = 21;

        System.out.println(" ****** Generacion de ticket de venta ******* ");

        System.out.println("Precio Leche: ");
        precioLeche = Double.parseDouble(console.nextLine());

        System.out.println("Precio Pan: ");
        precioPan = Double.parseDouble(console.nextLine());

        System.out.println(" Precio Lechuga: ");
        precioLechuga = Double.parseDouble(console.nextLine());

        System.out.println(" Aplicar algun descuento? (%)");
        int descuentoPorcentaje = Integer.parseInt(console.nextLine());

        console.close();

        // calcular subtotal sin impuestos
        subTotal = precioLeche + precioPan + precioLechuga;

        // cakcular descuento

        double descuento = subTotal * descuentoPorcentaje / 100.0;

        double subTotalConDescuento = subTotal - descuento;

        // calcular total con impuestos
        total = subTotalConDescuento + (subTotalConDescuento * impuesto / 100);

        System.out.println(" ********** Ticket de venta ********** ");

        System.out.printf("""
                Subtotal: %.2f,
                Subtotal Con descuento ( %.2f): %.2f
                Impuesto: %.2f%%
                Total: %.2f
                """, subTotal, descuento, subTotalConDescuento, impuesto, total);

    }
}
