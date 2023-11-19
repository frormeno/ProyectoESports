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

        Jugador jugador1 = new Jugador("Juliano", "20529998-k", "Colo-colo", 1, 23);
        Jugador jugador2 = new Jugador("Pancho", "17995532-6", "Varon", 2, 32);

        Equipo EquipoLol = new Equipo("Los Cabros");

        EquipoLol.agregarJugador(jugador2);
        EquipoLol.agregarJugador(jugador1);
        EquipoLol.listarJugador();
        EquipoLol.mostrarEquipo();

    }

}
