package ESport;

import java.util.ArrayList;

/**
 *
 * @author fgom9
 */
public class Equipo {

    String nombreEquipo;

    public Equipo() {
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + '}';
    }
    
    
    


    


}
