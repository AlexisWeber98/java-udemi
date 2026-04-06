package zona_fit.data;

import zona_fit.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.connection.ConnectionDb.getConnection;

public class ClientDAO implements IClientDAO {
    @Override
    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = getConnection();

        String sql = "SELECT * FROM client ORDER BY id";

        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setLastName(rs.getString("last_name"));
                client.setMembership(rs.getInt("membership"));
                clients.add(client);

            }
        } catch (Exception e) {
            System.out.println("Error al obtener los clientes: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (Exception exception) {
                System.out.println("Error al cerrar la conexión: " + exception.getMessage());
            }

        }
        return clients;
    }



    @Override
    public boolean findeClientById(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = getConnection();
        String sql = "SELECT * FROM client WHERE id = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, client.getId());
            rs = ps.executeQuery();
            if (rs.next()){
                client.setName(rs.getString("name"));
                client.setLastName(rs.getString("lastName"));
                client.setMembership(rs.getInt("membership"));
                return true;
            }
        } catch(Exception e){
            System.out.println("Error al encontrar el cliente: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println( "Error al cerrar la conexión: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    @Override
    public boolean addClient(Client client) {
        return false;
    }

    @Override
    public boolean updateClient(Client client) {
        return false;
    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }
}
