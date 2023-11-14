
package ESport;

/**
 *
 * @author fgom9
 */
public class Jugador {
    
    private String nombre,sexo;
    private int id, edad;

    public Jugador() {
    }

    public Jugador(String nombre, String sexo, int id, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", sexo=" + sexo + ", id=" + id + ", edad=" + edad + '}';
    }

    
    
    
    
}
