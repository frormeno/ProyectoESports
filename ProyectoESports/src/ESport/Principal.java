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

        String nombre, nombreEquipo;
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
                    equi.mostrarEquipo();
                    break;
                case 2:
                    System.out.println("Ingrese Nombre y apellido");
                    nombre = print.next();
                    System.out.println("Ingrese rut");
                    rut = print.next();
                    System.out.println("Ingrese sexo");
                    sexo=print.next();
                    System.out.println("Ingrese edad");
                    edad=print.nextInt();
                    jug.setNombre(nombre);
                    jug.setRut(rut);
                    jug.setSexo(sexo);
                    jug.setEdad(edad);
                    Jugad
                    
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del equipo: ");
                    nombreEquipo = print.next();
                    equipos.add(new Equipo(nombreEquipo));
                    System.out.println("Equipo creado \n");
                    for (Equipo equipo : equipos) {
                        System.out.println(equipo.nombre);
                    }
                    break;
//                case 4:
//                    Biblioteca.eliminarLibro();
//                    break;
//                case 5:
//                    System.out.println("¡Hasta pronto!");
//                    System.exit(0);
//                default:
//                    System.out.println("Opción no válida.");
            }
        }
    }

}


