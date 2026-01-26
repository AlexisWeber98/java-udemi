import java.util.Scanner;

public class DescuentoVip {
    public static void main(String[] args) {

        Boolean isVip;
        int countArticles;
        int discount = 15;

        System.out.println("Descuento VIP");

        var console = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de articulos comprados");
        countArticles = Integer.parseInt(console.nextLine());

        System.out.println("Es miembro de la tienda? (true/false)");

        isVip = Boolean.parseBoolean(console.nextLine());

        console.close();

        if (isVip && countArticles > 10) {
            System.out.println("Usted tiene un descuento del " + discount + "%");
        } else {
            System.out.println("Usted no tiene descuento");
        }

    }
}
