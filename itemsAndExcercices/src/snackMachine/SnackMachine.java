package snackMachine;

import com.sun.jdi.request.ExceptionRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {
    public static void main(String[] args) {
        snackMachine();

    }

    public static void snackMachine() {
        boolean exit = false;
        Scanner console = new Scanner(System.in);
        // create product snacks list

        List<Snack> products = new ArrayList<>();

        System.out.println("Welcome to the Snack Machine!");
        Snacks.showSnacks();

        while (!exit) {
            try {
                int option = showMenu(console);
                exit = executeOption(option, console, products);
            } catch (Exception error) {
                System.out.println("An error occurred: " + error.getMessage());
            } finally {
                System.out.println("\n");
            }
        }
    }

    private static int showMenu(Scanner console) {
        System.out.println("""
                Options:
                1. buy a snack
                2. show ticket
                3. add a snack
                4. exit
                
                please enter the number of the option you want to select: \s
                """);
        return  console.nextInt();
    }

    private static boolean executeOption(int option, Scanner console, List<Snack> products){
        boolean exit = false;
        switch (option) {
            case 1 -> buySnack(console, products);
            case 2 -> showTicket(products);
            //case 3 -> addSnack(console, products);
            case 4 -> exit = true;
            default -> System.out.println("Invalid option. Please try again.");
        }

        return exit;
    }

    private static void buySnack(Scanner console, List<Snack> products) {
        System.out.print("What snack do you want to buy? (id): ");
        int idSnack = console.nextInt();
        boolean found = false;
        for (Snack snack : Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                products.add (snack);
                found = true;
                System.out.println("You have bought: " + snack.getName() + " for $" + snack.getPrice());
                break;
            }
        }
        if (!found) {
            System.out.println("Snack with id " + idSnack + " not found.");
        }
    }

    private static void showTicket(List<Snack> products) {
        String ticket = "-------------------- Your Ticket --------------------\n" + "Products bought:\n";


        double total = 0.0;

        for (Snack product: products){
            ticket += product.getName() + " - $" + product.getPrice() + "\n";
            total += product.getPrice();

        }
        ticket += "\n\tTotal to pay: $" + total;
        System.out.println(ticket);

    }




}
