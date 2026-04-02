package zona_fit.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
    public static Connection getConnection() {
    Connection connection = null;
    String dataBase = "zona_fit_db";
    String url = "jdbc:mysql://localhost:3306/" + dataBase;
    String user = "root";
    String password = "admin123";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, password);

    } catch (Exception exception) {
        System.out.println("Error al conectar a la base de datos: " + exception.getMessage());
        throw new RuntimeException(exception);
    }
        return connection;
    }
}
