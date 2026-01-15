package example.zona_fit.controller;

import example.zona_fit.service.IClientService;
import org.springframework.web.bind.annotation.*;

import example.zona_fit.service.ClientService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/get-all")
    public IClientService lisOfClients() {
        log.info(" ----- Iniciando el metodo lisOfClients del controlador ClientController ----- ");
        return clientService.lisOfClients();
    }
}

