package example.zona_fit.service;

import example.zona_fit.model.Client;
import example.zona_fit.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> lisOfClients() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }

    @Override
    public Client findClientById(Integer clientId) {
        Client client = clientRepository.findById(clientId).orElse(null);

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
