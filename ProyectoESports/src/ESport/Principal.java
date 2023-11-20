package ESport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fgom9
 */
public class Principal {

    public static void main(String[] args) {

//        Jugador jugador1 = new Jugador("Juliano", "20529998-k", "Colo-colo", 1, 23);
//        Jugador jugador2 = new Jugador("Pancho", "17995532-6", "Varon", 2, 32);
//        ArrayList<Equipo> equipos = new ArrayList<>();
//        EquipoLol.agregarJugador(jugador2);
//        EquipoLol.agregarJugador(jugador1);
//        Jugadores.listarJugador();
//        Jugadores.mostrarEquipo();
        Equipo Jugadores = new Equipo();
        Coleccion col = new Coleccion();
        String nombre, nombreEquipo, asignado, equipoEleccion;
        String rut, sexo;
        int id;
        int edad;

        Equipo equi = new Equipo();
        Scanner print = new Scanner(System.in);
        Jugador jug = new Jugador();
        while (true) {
            System.out.println("ESport");
            System.out.println("1. Ver Equipos");
            System.out.println("2. Agregar Jugadores");
            System.out.println("3. Agregar Equipo");
            System.out.println("4. Agregar jugadores a equipo");
            System.out.println("5. Listar equipos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = print.nextInt();
            print.nextLine();

            switch (opcion) {
                case 1:
                    col.mostrarEquipo();
                    break;
                case 2:
                    col.agregarJugador(jug);

                    break;
                case 3:
                    System.out.print("Ingrese el nombre del equipo: ");
                    nombreEquipo = print.next();
                    equi.setNombreEquipo(nombreEquipo);
                    col.agregarEquipo(nombreEquipo);
                    System.out.println("Equipo creado \n");

                    break;
                case 4:

                    col.listarJugador();
                    System.out.println("Ingrese el nombre del jugador que desea asignar a un equipo: ");
                    String nombreJugador = print.next();

                    Jugador eleccionJugador = null;
                    for (Jugador jugador : col.getJugadores()) {
                        if (jugador.getNombre() == nombreJugador) {
                            eleccionJugador = jugador;
                            System.out.println("Jugador seleccionado" + jugador);
                            break;
                        }
                    }

                    col.mostrarEquipo();
                    System.out.println("Ingrese el nombre del equipo al que desea asignar el jugador: ");
                    String equipoNombre = print.next();

                    Equipo eleccionEquipo = null;
                    for (Equipo equipo : col.getEquipos()) {
                        if (equipo.getNombreEquipo().equals(equipoNombre)) {
                            eleccionEquipo = equipo;

                            col.asignarJugadorAEquipo(eleccionJugador, eleccionEquipo);
                            System.out.println("Jugador asignado al equipo correctamente.");
                            break;
                        }
                    }
                    break;

                case 5:
                    col.mostrarEquipo();
                    break;
                case 6:
                    System.out.println("¡Hasta pronto!");
                    System.exit(0);
//                default:
//                    System.out.println("Opción no válida.");
            }
        }
    }

}
