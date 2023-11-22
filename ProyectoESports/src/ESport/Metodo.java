package ESport;


import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



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
        System.out.print("Ingrese el rut del jugador sin puntos ni guión(111111111): ");
        String rut = scanner.nextLine();
        System.out.print("Indique genero (F/M): ");
        String sexo = scanner.nextLine();
        

        try (Connection connection = Conexion.obtenerConexion()) {
            String sql = "INSERT INTO EQUIPO (ID_JUGADOR, NOMBRE_JUGADOR,APPATERNO_JUGADOR,RUT_JUGADOR,SEXO) VALUES (SEQ_JUGADOR.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombreJugador);
            statement.setString(2, apellidoJugador);
            statement.setString(3, rut);
            statement.setString(4, sexo);
            statement.executeUpdate();

            System.out.println("Jugador añadido correctamente.");
            
        } catch (SQLException e) {
            System.err.println("Error al agregar el jugador: " + e.getMessage());
        }
    }

}



//     public void buscarEquipo(String nombreEquipo, List<Equipo> equipos) {
//        for (Equipo equi : equipos) {
//            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
//                return this.equipos;
//            }
//        }

