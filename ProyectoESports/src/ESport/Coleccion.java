package ESport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Coleccion {

    ArrayList<Jugador> Jugadores=new ArrayList <>();
    ArrayList<Equipo> equipos = new ArrayList<>();


    public Coleccion() {
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    
    
    public Coleccion(ArrayList<Jugador> Jugadores, ArrayList<Equipo> equipos) {
        this.Jugadores = Jugadores;
        this.equipos = equipos;
    }
    
    
    Equipo equi =new Equipo();
    Jugador jug = new Jugador();
    Scanner print = new Scanner(System.in);

public boolean agregarJugador(Jugador jugador) {
    Scanner print = new Scanner(System.in);

    System.out.println("Ingrese Nombre y apellido");
    String nombre = print.next();
    
    System.out.println("Ingrese rut");
    String rut = print.next();
    
    System.out.println("Ingrese sexo");
    String sexo = print.next();
    
    System.out.println("Ingrese edad");
    int edad = print.nextInt();

    jugador = new Jugador(nombre, rut, sexo, edad, edad);
    return Jugadores.add(jugador);
}
    
//public void asignarJugadorAEquipo(Jugador jugador, Equipo equipo) {
//    Jugadores.remove(jugador);
//    equipo.agregarJugador(jugador);
//}
    public void listarJugador() {
        for (Jugador Jugadore : Jugadores) {
            System.out.println(Jugadore);
        }
    }

//    public void mostrarEquipo() {
//        System.out.println("Los equipos son:");
//        for (Equipo equipo : equipos) {
//            System.out.println(equipo.nombreEquipo);
//        }

//        for (Jugador jug : Jugadores) {
//            System.out.println(" - " + jug.getNombre() + " (ID: " + jug.getId() + " / Rut: " + jug.getRut() + " / Sexo: " + jug.getSexo() + " / Edad: " + jug.getEdad() +equi.getNombreEquipo()+")");
////            System.out.println("El equipo es"+equi.getNombreEquipo());
//        }
//    }
//
//    public boolean agregarEquipo(String nombreEquipo) {
//        return equipos.add(new Equipo(nombreEquipo));
//    }
//    
//    public boolean agregarJugadorEquipo(Jugador jugador){
//        return Jugadores.add(jugador);
//    }
   
//    public boolean asignarJugadorEquipo(Jugador jugador){
//        return equipos.add(Jugadores);
//    }
}
