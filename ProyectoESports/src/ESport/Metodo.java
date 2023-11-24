package ESport;

import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author Julian
 */
public class Metodo {

    Scanner print = new Scanner(System.in);
    Equipo equipo = new Equipo();
    List<Equipo> equipos = new ArrayList<>();
    Jugador juga = new Jugador();

//    public void agregarJugador(Jugador jugador) {
//        System.out.println("Ingrese Nombre");
//        String nombre = print.next();
//        
//        System.out.println("Ingrese rut");
//        String rut = print.next();
//        
//        System.out.println("Ingrese sexo");
//        String sexo = print.next();
//        
//        System.out.println("Ingrese edad");
//        int edad = print.nextInt();
//        juga.setNombre(nombre);
//        juga.setEdad(edad);
//        juga.setRut(rut);
//        juga.setSexo(sexo);
//        equipo.getJugadores().add(juga);
//        System.out.println("Jugador agregado");
//    }
//    public void agregarEquipo1(Equipo equipo) {
//        System.out.println("Ingrese nombre de equipo");
//        String nombreEquipo = print.next();
//        equipos.add(equipo);
//        System.out.println("Equipo agregado");
//    }
//    public void borrarJugador(Jugador jugador) {
//        equipo.getJugadores().remove(jugador);
//    }
    public static void agregarEquipo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de equipo: ");
        String nombreEquipo = scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "INSERT INTO EQUIPO (ID_EQUIPO, NOMBRE_EQUIPO) VALUES (EQUIPO1_SEQ.NEXTVAL, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombreEquipo);
            statement.executeUpdate();

            System.out.println("Equipo añadido correctamente.");

        } catch (SQLException e) {
            System.err.println("Error al agregar el equipo: " + e.getMessage());
        }
    }

    public static void actualizarEquipo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID del equipo a actualizar: ");
        int id_equipo = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Nuevo nombre (dejar en blanco para no cambiar): ");
        String nombre_equipo = scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "UPDATE EQUIPO SET NOMBRE_EQUIPO = COALESCE(?, NOMBRE_EQUIPO)WHERE ID_EQUIPO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre_equipo.isEmpty() ? null : nombre_equipo);
            statement.setInt(2, id_equipo);
            statement.executeUpdate();

            System.out.println("Equipo actualizado exitosamente.");

        } catch (SQLException e) {
            System.err.println("Error al actualizar el equipo: " + e.getMessage());
        }
    }

    public static void agregarJugador() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del jugador: ");
        String nombreJugador = scanner.nextLine();
        System.out.print("Primer apellido del jugador: ");
        String apellidoJugador = scanner.nextLine();
        System.out.print("Edad del jugador: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el rut del jugador sin puntos ni guión: ");
        String rut = scanner.nextLine();

//        System.out.print("Indique genero (F/M): ");
//        String sexo = scanner.nextLine();
        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "INSERT INTO JUGADOR (ID_JUGADOR, NOMBRE_JUGADOR,APPATERNO_JUGADOR,EDAD_JUGADOR,RUT_JUGADOR) VALUES (SEQ_JUGADOR.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombreJugador);
            statement.setString(2, apellidoJugador);
            statement.setInt(3, edad);
            statement.setString(4, rut);

            statement.executeUpdate();

            System.out.println("Jugador añadido correctamente.");

        } catch (SQLException e) {
            System.err.println("Error al agregar el jugador: " + e.getMessage());
        }
    }

    public static void agregarJugadorAEquipo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese id de equipo al que desea agregar el jugador: ");
        int idEquipo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese id de jugador que desea agregar al equipo: ");
        int idJugador = scanner.nextInt();
        scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "INSERT INTO REGISTRO_EQUIPO (ID_EQUIPO, ID_JUGADOR) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idEquipo);
            statement.setInt(2, idJugador);

            statement.executeUpdate();

            System.out.println("Jugador añadido correctamente.");

        } catch (SQLException e) {
            System.err.println("Error al agregar el jugador: " + e.getMessage());
        }
    }

    public static void actualizarJugador() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID del jugador a actualizar: ");
        int id_jugador = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Nuevo nombre (dejar en blanco para no cambiar): ");
        String nombre_jugador = scanner.nextLine();
        System.out.print("Nuevo apellido (dejar en blanco para no cambiar): ");
        String ape_jugador = scanner.nextLine();
        System.out.print("Nuevo edad (dejar en blanco para no cambiar): ");
        int edad_jugador = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nuevo rut (dejar en blanco para no cambiar): ");
        String rut_jugador = scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "UPDATE JUGADOR SET NOMBRE_JUGADOR = COALESCE(?, NOMBRE_JUGADOR), APPATERNO_JUGADOR = COALESCE(?, APPATERNO_JUGADOR),EDAD_JUGADOR = COALESCE(?, EDAD_JUGADOR),RUT_JUGADOR = COALESCE(?, RUT_JUGADOR) WHERE ID_JUGADOR = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre_jugador.isEmpty() ? null : nombre_jugador);
            statement.setString(2, ape_jugador.isEmpty() ? null : ape_jugador);
            statement.setInt(3, edad_jugador);
            statement.setString(4, rut_jugador.isEmpty() ? null : rut_jugador);
            statement.setInt(5, id_jugador);
            statement.executeUpdate();

            System.out.println("Equipo actualizado exitosamente.");

        } catch (SQLException e) {
            System.err.println("Error al actualizar el equipo: " + e.getMessage());

        }
    }

    public static void eliminarJugador() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID del jugador que quieres eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "DELETE FROM JUGADOR WHERE ID_JUGADOR = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();

            System.out.println("Jugador eliminado exitosamente.");

        } catch (SQLException e) {
            System.err.println("Error al eliminar el Jugador: " + e.getMessage());
        }
    }
    
    
    public static void eliminarEquipo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID del equipo que quieres eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "DELETE FROM EQUIPO WHERE ID_EQUIPO = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();

            System.out.println("Equipo eliminado exitosamente.");

        } catch (SQLException e) {
            System.err.println("Error al eliminar el Equipo: " + e.getMessage());
        }
    }
    
        public static void mostrarEquipo() throws Exception {
        String sql = "SELECT * FROM EQUIPO";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_EQUIPO");
                String NOMBRE_EQUIPO = resultSet.getString("NOMBRE_EQUIPO");
                System.out.println("ID: " + id + ", NOMBRE DEL EQUIPO: " + NOMBRE_EQUIPO);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de Equipos: " + e.getMessage());
        }
    }
        
        public static void mostrarJugador() throws Exception {
        String sql = "SELECT * FROM JUGADOR";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_JUGADOR");
                String NOMBRE_JUGADOR = resultSet.getString("NOMBRE_JUGADOR");
                String APPATERNO_JUGADOR = resultSet.getString("APPATERNO_JUGADOR");
                int EDAD_JUGADOR = resultSet.getInt("EDAD_JUGADOR");
                String RUT_JUGADOR = resultSet.getString("RUT_JUGADOR");
                System.out.println("ID: " + id + ", NOMBRE DEL JUGADOR: " + NOMBRE_JUGADOR +", Apellido paterno: "+APPATERNO_JUGADOR+", Edad jugador: "+EDAD_JUGADOR+", Rut del jugador: "+ RUT_JUGADOR);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de Jugadores: " + e.getMessage());
        }
    }        

        public static void mostrarEquipoJug() throws Exception {
        String sql = "SELECT R.ID_EQUIPO, E.NOMBRE_EQUIPO, R.ID_JUGADOR, J.NOMBRE_JUGADOR FROM  REGISTRO_EQUIPO R JOIN EQUIPO E ON (R.ID_EQUIPO=E.ID_EQUIPO) JOIN JUGADOR J ON (R.ID_JUGADOR=J.ID_JUGADOR) GROUP BY R.ID_EQUIPO,E.NOMBRE_EQUIPO,R.ID_JUGADOR,J.NOMBRE_JUGADOR";
        try (Connection connection = Conexion.obtenerConexion();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id_equipo = resultSet.getInt("ID_EQUIPO");
                String nombre_equipo = resultSet.getString("NOMBRE_EQUIPO");
                int id_jugador = resultSet.getInt("ID_JUGADOR");
                String nombre_jugador= resultSet.getString("NOMBRE_JUGADOR");
                System.out.println("ID del equipo: " + id_equipo + ", NOMBRE DEL EQUIPO: "+ nombre_equipo+" ID DEL JUGADOR: "+ id_jugador+ " NOMBRE DEL JUGADOR: "+ nombre_jugador);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de Jugadores: " + e.getMessage());
        }
    }
}

//     public void buscarEquipo(String nombreEquipo, List<Equipo> equipos) {
//        for (Equipo equi : equipos) {
//            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
//                return this.equipos;
//            }
//        }

