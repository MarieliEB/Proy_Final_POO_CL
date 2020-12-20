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
    private int id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private ArrayList<Artista> artistas;
    private String imagen;
    private int idCliente;

    public Album(int id, String nombre, LocalDate fechaLanzamiento, String imagen, int idCliente) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.artistas = artistas;
        this.imagen = imagen;
        this.idCliente = idCliente;
    }

    public Album( String nombre, LocalDate fechaLanzamiento, String imagen, int idCliente) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.artistas = artistas;
        this.imagen = imagen;
        this.idCliente = idCliente;
    }

    public Album(String nombre) {
        this.nombre = nombre;
    }

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Album(Artista nuevoArtista){
        this.artistas.add(nuevoArtista);
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


    @Override
    public String toString() {
        return "Album{" +
                "nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", artistas=" + artistas +
                ", imagen='" + imagen + '\'' +
                ", cliente=" + idCliente +
                '}';
    }
}
