package ESport;

/**
 *
 * @author fgom9
 */
public class Jugador {

    private String nombre;
    private String rut, sexo;
    private int id;
    private int edad;
 

    public Jugador() {
    }

    public Jugador(String nombre, String rut, String sexo, int id, int edad) {
        this.nombre = nombre;
        this.rut = rut;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
        return "Jugador{" + "nombre=" + nombre + ", rut=" + rut + ", sexo=" + sexo + ", id=" + id + ", edad=" + edad + '}';
    }
    
        public void imprimirDetalles(){
        System.out.println(
                "ID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Rut: " + rut + "\n" +
                "Sexo: " + sexo + "\n" +
                "Edad: " + edad + "\n" 
        );
    }
    
    
}
