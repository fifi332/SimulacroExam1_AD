// Paquete donde está la clase.
package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_connector {
    public static void main(String[] args) {

        // Dirección del servidor, puerto y nombre de la base de datos.
        String url = "jdbc:postgresql://10.0.9.238:5432/videoxogo";

        // Usuario y contraseña de PostgreSQL.
        String usuario = "postgres";
        String contrasena = "admin";

        // Intenta abrir la conexión con los datos anteriores.
        // El try cierra la conexión automáticamente al terminar.
        try (Connection conexion =
                     DriverManager.getConnection(url, usuario, contrasena)) {

            // Si conecta, muestra este mensaje.
            System.out.println("Conectado correctamente");

        } catch (SQLException e) {

            // Si ocurre un error, muestra su descripción.
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}