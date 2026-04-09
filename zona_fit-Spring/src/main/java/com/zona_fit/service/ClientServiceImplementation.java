package com.zona_fit.service;

import com.zona_fit.model.Client;
import com.zona_fit.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImplementation implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.findAll();

        return clients;
    }


    @Override
    public Client getClientById(Integer id) {
        Client client = clientRepository.findById(id).orElse(null);
        return client;
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }
}

