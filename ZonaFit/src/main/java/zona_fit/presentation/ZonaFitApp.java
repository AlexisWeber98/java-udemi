package zona_fit.presentation;

import zona_fit.data.ClientDAO;
import zona_fit.data.IClientDAO;
import zona_fit.domain.Client;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main() {
        zonaFitApp();
    }

    private static void zonaFitApp() {
        System.out.println("Bienvenido a Zona Fit");
        boolean exit = false;
        Scanner console = new Scanner(System.in);

        IClientDAO clientDAO = new ClientDAO();

        while (!exit) {
            try {
                int option = showMenu(console);
                exit = executeOptions(console, option, clientDAO);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }
    }


    private static int showMenu(Scanner console) {
        System.out.println("\n----------------- Zona Fit GYM -----------------\n");
        System.out.println("""
                1. Show clients
                2. Find client by ID
                3. Add client
                4. Update client
                5. Delete client
                6. Exit
                
                Choice an Option:\s""");
        return Integer.parseInt(console.nextLine().trim());

    }

    private static boolean executeOptions(Scanner console, int option, IClientDAO clientDAO) {
        boolean exit = false;
        switch (option) {

            case 1 -> {

                var clients = clientDAO.getAllClients();

                System.out.println("\n ---------------------------  List of Clients ------------------------ \n");
                clients.forEach(System.out::println);

            }
            case 2 ->{
                System.out.println( "\n---------------------------  Find Client by ID ------------------------ \n");
                System.out.println("Enter the client ID to find:");
                int id = Integer.parseInt(console.nextLine().trim());
                var clientToFind = new Client(id);
                var client = clientDAO.findeClientById(clientToFind);
                System.out.println(client ? "Client found: " + clientToFind : "Client not found");

            }
            case 3 ->{
                    System.out.println( "\n---------------------------  Add Client ------------------------ \n");
                System.out.println("Enter the client's name:");
                String name = console.nextLine().trim();

                System.out.println("Enter the client's last name:");
                String lastName = console.nextLine().trim();

                System.out.println("Enter the client's membership:");
                int membership = Integer.parseInt(console.nextLine().trim());

                boolean addedClient = clientDAO.addClient(new Client(name, lastName, membership));

                if (addedClient){
                    System.out.println("Client added successfully.");
                    System.out.println("Client added: " + name + " " + lastName);
                } else {
                    System.out.println("Failed to add client: " + name + " " + lastName);
                }
            }
            case 4 -> {
                System.out.println( "\n---------------------------  Update Client ------------------------ \n");
                System.out.println("Enter the client ID to update:");
                int id = Integer.parseInt(console.nextLine().trim());

                System.out.println("Enter the client's new name:");
                String name = console.nextLine().trim();

                System.out.println("Enter the client's new last name:");
                String lastName = console.nextLine().trim();

                System.out.println("Enter the client's new membership:");
                int membership = Integer.parseInt(console.nextLine().trim());

                var clientToUpdate = new Client(id, name, lastName, membership);
                boolean updatedClient = clientDAO.updateClient(clientToUpdate);
                if (updatedClient) {
                    System.out.println("Client updated successfully.");
                    System.out.println("Client updated: " + clientToUpdate);
                } else {
                    System.out.println("Failed to update client with ID: " + id);
                }
            }
            case 5 -> {
                System.out.println( "\n---------------------------  Delete Client ------------------------ \n");
                System.out.println("Enter the client ID to delete:");
                int id = Integer.parseInt(console.nextLine().trim());
                var clientToDelete = new Client(id);
                boolean deletedClient = clientDAO.deleteClient(clientToDelete);
                if (deletedClient) {
                    System.out.println("Client deleted successfully.");
                    System.out.println("Client deleted: " + id);
                } else {
                    System.out.println("Failed to delete client with ID: " + id);
                }
            }

            case 6 -> {
                System.out.println("\n---------------------------  Exit ------------------------ \n");
                System.out.println("Thanks you for use Zona Fit. ¡See you soon!");
                exit = true;
            }

            default -> System.out.println("Invalid option. Please try again.");

        }

        return exit;

    }
}