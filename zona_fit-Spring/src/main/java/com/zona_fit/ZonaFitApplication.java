package com.zona_fit;

import com.zona_fit.model.Client;
import com.zona_fit.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication  implements CommandLineRunner {
	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info(" ------------------------ Application Finished -----------------------");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

 	private void zonaFitApp() {
logger.info (" -----------------------  Welcome to Zona Fit App --------------------- ");
	 	boolean exit = false;
		Scanner console = new Scanner(System.in);
	 	while (!exit) {
			 int option =showOptions(console);
			 exit = executeOptions(option, console);
		 }
 	}

	 public int showOptions ( Scanner console) {
		 logger.info(" ----------------------- Zona Fit App Show options --------------------- ");
		 System.out.println("1. Show all clients");
		 System.out.println("2. Show client by id");
		 System.out.println("3. Create new client");
		 System.out.println("4. Update client");
		 System.out.println("5. Delete client");
		 System.out.println("6. Exit");
		 logger.info(" -----------------------  Select an option --------------------- ");

		 try {
			 return Integer.parseInt(console.nextLine());
		 } catch (NumberFormatException ex) {
			 logger.warn("Invalid input. Please enter a number.");
			 return -1;
		 }

	 }

	 private boolean executeOptions  (int option, Scanner console) {
		boolean exit = false;
		switch (option) {
			case 1 -> {
				logger.info(" -----------------------  Show all clients --------------------- \n");

				List<Client> clients = clientService.getAllClients();
				clients.forEach(client -> logger.info(client.toString()));
			}

			case 2 -> {
				logger.info(" -----------------------  Show client by id --------------------- ");

				System.out.println("Enter client id: ");

				Integer id = console.nextInt();
				console.nextLine();
				Client client = clientService.getClientById(id);
				if (client != null) {
					logger.info(client.toString());
				} else {
					logger.info("Client not found");
				}
			}

			case 3 -> {
				logger.info(" -----------------------  Create new client --------------------- ");


				Client newClient = new Client();
				System.out.println("Enter name: ");
				newClient.setName(console.nextLine());
				System.out.println("Enter last name: ");
				newClient.setLastName(console.nextLine());
				System.out.println("Enter membership: ");
				newClient.setMembership(console.nextInt());
				console.nextLine();
				clientService.saveClient(newClient);
			}
			case 4 -> {
				logger.info(" -----------------------  Update client --------------------- ");

					Client updateClient = new Client();
					System.out.println("Enter client id: ");
					updateClient.setId(console.nextInt());
					console.nextLine();
					System.out.println("Enter name: ");
					updateClient.setName(console.nextLine());
					System.out.println("Enter last name: ");
					updateClient.setLastName(console.nextLine());
					System.out.println("Enter membership: ");
					updateClient.setMembership(console.nextInt());
					console.nextLine();
					clientService.saveClient(updateClient);

		}

				case 5 -> {
					logger.info(" -----------------------  Delete client --------------------- ");

					Client deleteClient = new Client();
					System.out.println("Enter client id: ");
					deleteClient.setId(console.nextInt());
					console.nextLine();

					clientService.deleteClient(deleteClient);

				}

				case 6 -> {
					logger.info(" -----------------------  Exit application --------------------- ");

					return true;
				}
				default -> {
					logger.info(" -----------------------  Invalid Option --------------------- ");
				}
			}
			return exit;
		}
	}

