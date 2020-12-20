package cr.ac.ucenfotec.bl.entities.compositor;

import cr.ac.ucenfotec.bl.entities.artista.Artista;

import java.time.LocalDate;

/** Clase para la creacion de compositores extiende de Artista
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Compositor extends Artista {

    public Compositor(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) {
        super(nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion);
    }

    public Compositor(int id, String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) {
        super(id, nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion);
    }

    public Compositor(String nombre) {
        super(nombre);
    }

    public Compositor() {
    }
}
