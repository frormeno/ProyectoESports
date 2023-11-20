package ESport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Coleccion {

    ArrayList<Jugador> Jugadores=new ArrayList <>();
    ArrayList<Equipo> equipos=new ArrayList <>();

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
    
    

    Jugador jug = new Jugador();
    Scanner print = new Scanner(System.in);

    public boolean agregarJugador(Jugador jugador) {
        System.out.println("Ingrese Nombre y apellido");
        String nombre = print.next();
        System.out.println("Ingrese rut");
        String rut = print.next();
        System.out.println("Ingrese sexo");
        String sexo = print.next();
        System.out.println("Ingrese edad");
        int edad = print.nextInt();
        jug.setNombre(nombre);
        jug.setRut(rut);
        jug.setSexo(sexo);
        jug.setEdad(edad);
        return Jugadores.add(jugador);

    }

    public void listarJugador() {
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
        }
    }

    public void mostrarEquipo() {
        System.out.println("Los equipos son:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.nombreEquipo);
        }

//        for (Jugador jugador : Jugadores) {
//            System.out.println(" - " + jugador.nombre + " (ID: " + jugador.id + " / Rut: " + jugador.rut + " / Sexo: " + jugador.sexo + " / Edad: " + jugador.edad + ")");
//        }
    }

    public boolean agregarEquipo(Equipo equipo, String nombreEquipo) {
        return equipos.add(new Equipo(nombreEquipo));
    }
    
//    public boolean asignarJugadorEquipo(Jugador jugador){
//        return equipos.add(Jugadores);
//    }
}
