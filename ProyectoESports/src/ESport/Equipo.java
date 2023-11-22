package ESport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fgom9
 */
public class Equipo {

    private String nombreEquipo;
    private List<Jugador> jugadores;
    private int idEquipo;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, List<Jugador> jugadores, int idEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", jugadores=" + jugadores + ", idEquipo=" + idEquipo + '}';
    }

            
    
    


    


}
