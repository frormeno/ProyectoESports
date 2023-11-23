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
                case 4:
                    met.agregarJugadorAEquipo();

                    break;

                case 5:
                    met.actualizarJugador();
                    break;

                case 6:
                    met.eliminarJugador();
                    break;
                    case 7:
                    met.eliminarEquipo();
                    break;
                    case 8:
                    met.mostrarEquipo();
                    break;
                    case 9:
                    met.mostrarJugador();
                    break;
//                case 6:
//                    System.out.println("¡Hasta pronto!");
//                    System.exit(0);
//                default:
//                    System.out.println("Opción no válida.");
//            }
//        }
            }
        }
    }
}
