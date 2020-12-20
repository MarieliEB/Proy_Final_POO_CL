package cr.ac.ucenfotec.bl.entities.artista;

import java.time.LocalDate;

/** Clase para la creacion de artistas
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Artista {
    private int id;
    private String nombre;
    private String apellido;
    private String nombreArtistico;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion;
    private String paisNacimiento;
    private String genero;
    private int edad;
    private String descripcion;

    public Artista(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
        this.edad = edad;
        this.descripcion = descripcion;
    }

    public Artista(int id, String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
        this.edad = edad;
        this.descripcion = descripcion;
    }

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public Artista() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaDefuncion() {
        return fechaDefuncion;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaDefuncion(LocalDate fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombreArtistico='" + nombreArtistico + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaDefuncion=" + fechaDefuncion +
                ", paisNacimiento=" + paisNacimiento +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
