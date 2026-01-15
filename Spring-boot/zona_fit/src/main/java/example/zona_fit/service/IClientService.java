package example.zona_fit.service;

import java.util.List;
import example.zona_fit.model.Client;

public interface IClientService {

    public List<Client> lisOfClients();

    public Client findClientById(Integer clientId);

    public void saveClient(Client client);

    public void deleteClient(Client client);
}
