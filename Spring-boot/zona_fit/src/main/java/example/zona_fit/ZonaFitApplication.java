package example.zona_fit;

import example.zona_fit.model.Client;
import example.zona_fit.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	public Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		logger.info(" ---------- Iniciando la aplicacion Zona Fit ---------- ");
		SpringApplication.run(ZonaFitApplication.class, args);

		logger.info(" ---------- Aplicacion Zona Fit Iniciada ---------- ");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("El método 'run' se ha ejecutado correctamente.");

		zonaFitApplication();
	}

	private void zonaFitApplication() {
		boolean logout = false;

		while (!logout) {
			var option = showMenu();

			logout = handleMenuOption(console, option);
			logger.info(" ");

		}

	}

	private boolean handleMenuOption(Scanner console, int option) {
		logger.info("Opción seleccionada: " + option);
		switch (option) {
			case 1 -> {
				logger.info("Listado de Clientes:");
				List<Client> clients = clientService.lisOfClients();
				clients.forEach(client -> logger.info(client.toString()));
				if (clients.isEmpty()) {
					logger.info("No hay clientes registrados.");
				}
			}
			case 2 -> {
				logger.info("Buscar Cliente:");

			}
			case 3 -> {
				logger.info("Agregar Cliente:");
				Client newCLient = new Client();

			}
			case 4 -> {
				logger.info("Editar Cliente:");
			}
			case 5 -> {
				logger.info("Eliminar Cliente:");
			}
			case 6 -> {
				logger.info("Saliendo de la aplicación. ¡Hasta luego!");
				return false;
			}
			default -> logger.info("Opción no válida. Por favor, intente de nuevo.");
		}

		return true;
	}

	private int showMenu() {
		System.out.println("\n");
		logger.info(" ----- ZONA FIT ----- ");
		logger.info("""
					\n
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente
				4. Editar Cliente
				5. Eliminar Cliente
				6. Salir

				Ingrese una opción:
							""");

		var option = Integer.parseInt(console.nextLine());
		return option;
	}

}
