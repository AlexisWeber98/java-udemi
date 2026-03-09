import java.util.Scanner;

public class SendSistem {
    public static void main(String[] args) {

        /*
         * crear un programa que determine el costo de envio de un paquete segun el
         * destino (nacional/internacional)
         * y el peso del mismo
         * 
         * costo nacional $10 por kg
         * costo internacional $20 por kg
         */

        int nationalCost = 10;
        int internationalCost = 20;

        Scanner console = new Scanner(System.in);

        System.out.println(
                "----------------------------- please enter the destination (national/international) ----------------------------");
        String destiny = console.nextLine();

        System.out.println(
                "----------------------------- please enter the weight of the package in kg ----------------------------");
        double weight = console.nextDouble();

        console.close();

        switch (destiny.toLowerCase()) {
            case "national" -> System.out.printf("The national shipping cost is: $%.2f%n", (weight * nationalCost));
            case "international" ->
                System.out.printf("The international shipping cost is: $%.2f%n", (weight * internationalCost));
            default -> System.out.println("Invalid destination");
        }

    }
}
