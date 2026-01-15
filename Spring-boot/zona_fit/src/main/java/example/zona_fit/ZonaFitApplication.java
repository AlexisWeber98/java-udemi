package example.zona_fit;

import example.zona_fit.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZonaFitApplication {
	@Autowired
	private IClientService clientService;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {

		logger.info(" ---------- Iniciando la aplicacion Zona Fit ---------- ");
		SpringApplication.run(ZonaFitApplication.class, args);

		logger.info(" ---------- Aplicacion Zona Fit Iniciada ---------- ");
	}


}
