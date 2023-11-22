package ESport;

/**
 *
 * @author fgom9
 */
public class Jugador {

    private String nombre,apellidoPaterno;
    private String rut, sexo;
    private int idJugador;
    private int edad;

    public Jugador() {
    }

    public Jugador(String nombre, String apellidoPaterno, String rut, String sexo, int idJugador, int edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.rut = rut;
        this.sexo = sexo;
        this.idJugador = idJugador;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
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

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", rut=" + rut + ", sexo=" + sexo + ", idJugador=" + idJugador + ", edad=" + edad + '}';
    }

    

    
    
        public void imprimirDetalles(){
        System.out.println(
                "ID: " + idJugador + "\n" +
                "Nombre: " + nombre + "\n" +
                "Rut: " + rut + "\n" +
                "Sexo: " + sexo + "\n" +
                "Edad: " + edad + "\n" 
        );
    }
    
    
}
