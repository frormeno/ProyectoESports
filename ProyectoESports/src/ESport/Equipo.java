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
    private ArrayList<Jugador> EquipoLol;

    public Equipo() {

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
        }
