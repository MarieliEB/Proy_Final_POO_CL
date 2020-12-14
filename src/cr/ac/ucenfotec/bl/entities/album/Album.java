package cr.ac.ucenfotec.bl.entities.album;

import cr.ac.ucenfotec.bl.entities.artista.Artista;
import cr.ac.ucenfotec.bl.entities.cliente.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

/** Clase para la creacion de cada album de la aplicación
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Album {
    private String nombre;
    private LocalDate fechaLanzamiento;
    private ArrayList<Artista> artistas;
    private String imagen;
    private Cliente cliente;

    public Album(String nombre, LocalDate fechaLanzamiento, ArrayList<Artista> artistas, String imagen, Cliente cliente) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.artistas = artistas;
        this.imagen = imagen;
        this.cliente = cliente;
    }

    public Album() {
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public String getImagen() {
        return imagen;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", artistas=" + artistas +
                ", imagen='" + imagen + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
