package zona_fit.data;

import zona_fit.domain.Client;

import java.util.List;

public interface IClientDAO {
    List<Client> getAllClients();
    boolean findeClientById(Client client);
    boolean addClient(Client client);
    boolean updateClient(Client client);
    boolean deleteClient(Client client);
}
