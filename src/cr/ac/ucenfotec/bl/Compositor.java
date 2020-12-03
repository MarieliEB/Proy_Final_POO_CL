package cr.ac.ucenfotec.bl;

import java.time.LocalDate;

/** Clase para la creacion de compositores extiende de Artista
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Compositor extends Artista {

    public Compositor(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, Pais paisNacimiento, String genero, int edad, String descripcion) {
        super(nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion);
    }

    public Compositor() {
    }
}
