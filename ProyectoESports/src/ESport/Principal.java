package ESport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fgom9
 */
public class Principal {

    public static void main(String[] args) throws Exception {


        
        Equipo equi = new Equipo();
        Metodo met = new Metodo();
        Scanner print = new Scanner(System.in);
        Jugador jug = new Jugador();
        while (true) {
            System.out.println("ESport");
            System.out.println("1. Crear equipo");
            System.out.println("2. Crear Jugador");
            System.out.println("3. Modificar equipo");
            System.out.println("4. Agregar jugadores a equipo");
            System.out.println("5. Listar equipos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = print.nextInt();
            print.nextLine();

            switch (opcion) {
                case 1:
                    met.agregarEquipo();
                    break;
                case 2:
                    met.agregarJugador();
                    break;
                case 3:
                    met.actualizarEquipo();

                    break;
//                case 4:
//
//                    col.listarJugador();
//                    System.out.println("Ingrese el nombre del jugador que desea asignar a un equipo: ");
//                    String nombreJugador = print.next();
//
//                    Jugador eleccionJugador = null;
//                    for (Jugador jugador : col.getJugadores()) {
//                        if (jugador.getNombre() == nombreJugador) {
//                            eleccionJugador = jugador;
//                            System.out.println("Jugador seleccionado" + jugador);
//                            break;
//                        }
//                    }
//
//                    col.mostrarEquipo();
//                    System.out.println("Ingrese el nombre del equipo al que desea asignar el jugador: ");
//                    String equipoNombre = print.next();
//
//                    Equipo eleccionEquipo = null;
//                    for (Equipo equipo : col.getEquipos()) {
//                        if (equipo.getNombreEquipo().equals(equipoNombre)) {
//                            eleccionEquipo = equipo;
//
//                            col.asignarJugadorAEquipo(eleccionJugador, eleccionEquipo);
//                            System.out.println("Jugador asignado al equipo correctamente.");
//                            break;
//                        }
//                    }
//                    break;
//
//                case 5:
//                    col.mostrarEquipo();
//                    break;
//                case 6:
//                    System.out.println("¡Hasta pronto!");
//                    System.exit(0);
//                default:
//                    System.out.println("Opción no válida.");
//            }
//        }
    }
         }    
 } }