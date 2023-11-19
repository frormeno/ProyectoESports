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
    ArrayList<Jugador> EquipoLol;

    public Equipo() {
    }
    
    

    public Equipo(String nombre) {
        this.nombre = nombre;
        EquipoLol = new ArrayList<Jugador>();

    }



    public boolean agregarJugador(Jugador jugador) {
        return EquipoLol.add(jugador);

    }

    public void listarJugador() {
        for (Jugador jugador : EquipoLol) {
            System.out.println(jugador);
        }
    }
    
    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugadores:");

        for (Jugador jugador : EquipoLol) {
            System.out.println(" - " + jugador.nombre + " (ID: "+ jugador.id + " / Rut: " + jugador.rut+" / Sexo: "+ jugador.sexo + " / Edad: " + jugador.edad + ")");
        }
    }


    
}
