/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ESport;

/**
 *
 * @author fgom9
 */
public class Principal {
    public static void main(String[] args) {
        
        Jugador jugador1= new Jugador("Julian", "no binario", 1, 22);
        Jugador jugador2= new Jugador("Pancho", "Hombre", 2, 32);
        
        Equipo EquipoLol=new Equipo();
        
        EquipoLol.agregarJugador(jugador2);
        EquipoLol.agregarJugador(jugador1);
        EquipoLol.listarJugador();
        
        
    }
    
}
