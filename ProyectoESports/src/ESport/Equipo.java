package ESport;

/**
 *
 * @author fgom9
 */
public class Equipo {

    private String nombreEquipo;
    private int idEquipo;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, int idEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", idEquipo=" + idEquipo + '}';
    }

    

    

            
    
    


    


}
