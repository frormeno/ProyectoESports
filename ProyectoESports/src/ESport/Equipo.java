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

    String nombre;
    ArrayList<Jugador> Jugadores;
    ArrayList<Equipo> equipos = new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        Jugadores = new ArrayList<Jugador>();

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
            System.out.println(equipo.nombre);
        }

        for (Jugador jugador : Jugadores) {
            System.out.println(" - " + jugador.nombre + " (ID: " + jugador.id + " / Rut: " + jugador.rut + " / Sexo: " + jugador.sexo + " / Edad: " + jugador.edad + ")");
        }
    }

}
