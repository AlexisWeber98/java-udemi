package zona_fit;

import zona_fit.data.ClientDAO;
import zona_fit.data.IClientDAO;
import zona_fit.domain.Client;

import java.awt.*;


public class Main {
    public static void main(String[] args) {

        IClientDAO clientDAO = new ClientDAO();

        //  ------------ listar clientes ----------------

        var clients = clientDAO.getAllClients();
        System.out.println("\n ---------------------------  Lista de clientes antes de la actualización ------------------------ \n");
        for (Client client : clients) {
            System.out.println(client);
        }


       /*
        Client client1 = new Client(2);
        System.out.println("cliente antes de la busqueda: " + client1);

        boolean findClient = clientDAO.findeClientById(client1);
        if (findClient) {
            System.out.println("cliente encontrado: " + client1);
        } else {
            System.out.println("cliente no encontrado");
        }*/



       /*
       // Agregar cliente
          Client newClient = new Client("Pepe", "Gomez", 400);
        boolean addClient = clientDAO.addClient(newClient);

        if (addClient) {
            System.out.println("cliente agregado: "+ newClient );
        } else {
            System.out.println("cliente no agregado");
        }
        */

        // actualizar cliente
       /*
        var modifyClient = new Client(7,"Jacinto", "Perez Díaz",4000);

        var modify = clientDAO.updateClient(modifyClient);

        if (modify) {
            System.out.println(" client modify : " + modifyClient);
        } else System.out.println("Error updating client : " + modifyClient);
*/


//eliminar clientes

        var clientForDelete = new Client(7);
           boolean deleteClient = clientDAO.deleteClient(clientForDelete);
        if (deleteClient){
            System.out.println("client delete : " + deleteClient);
        } else System.out.println("Error deleting client : " + deleteClient);

         clients = clientDAO.getAllClients();
        System.out.println("\n---------------------------  Lista de clientes después de la actualización ------------------------ \n");
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}