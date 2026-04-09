package com.zona_fit.service;

import com.zona_fit.model.Client;

import java.util.List;

public interface IClientService {
    public List<Client> getAllClients();
    public Client getClientById(Integer id);
    public void saveClient(Client client);
    public void deleteClient(Client client);
}
