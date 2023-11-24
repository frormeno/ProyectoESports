package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author fgom9
 */
public class Conexion {

    private static final String WALLET_PATH = "C:/Users/Julian/Downloads/Wallet_DBESport";
    private static final String WALLET_PASSWORD = "Py4fe0mg.1812";
    private static final String JDBC_URL = "jdbc:oracle:thin:@dbesport_high";// - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";

    public static Connection obtenerConexion() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "admin");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    }
}
