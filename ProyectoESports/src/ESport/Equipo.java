/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ESport;

import java.util.ArrayList;

/**
 *
 * @author fgom9
 */
public class Equipo {

    String nombreEquipo;
    ArrayList<Jugador> Jugadores;
    ArrayList<Equipo> equipos = new ArrayList<>();

    public Equipo() {
    }
    
    
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        Jugadores = new ArrayList<Jugador>();
        
        
        

    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
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

    public boolean agregarJugador(Jugador jugador) {
        return Jugadores.add(jugador);

    }

    public void listarJugador() {
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
        }
    }

    public void mostrarEquipo() {
        for (Equipo equipo : equipos) {
            System.out.println(equipo.nombreEquipo);
        }

//        for (Jugador jugador : Jugadores) {
//            System.out.println(" - " + jugador.nombre + " (ID: " + jugador.id + " / Rut: " + jugador.rut + " / Sexo: " + jugador.sexo + " / Edad: " + jugador.edad + ")");
//        }
    }

    public boolean agregarEquipo(Equipo equipo) {
        return equipos.add(new Equipo(nombreEquipo));
    }

//    public void listarEquipos() {
//        for (Equipo equipo : equipos) {
//            System.out.println(equipos);
//        }
//    }

}
