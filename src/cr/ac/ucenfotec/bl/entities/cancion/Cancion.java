package cr.ac.ucenfotec.bl.entities.cancion;

import cr.ac.ucenfotec.bl.entities.compositor.Compositor;
import cr.ac.ucenfotec.bl.entities.genero.Genero;
import cr.ac.ucenfotec.bl.entities.album.Album;
import cr.ac.ucenfotec.bl.entities.artista.Artista;

import java.time.LocalDate;

/** Clase para la creacion de canciones
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Cancion {

    private int id;
    private Genero genero;
    private Artista artista;
    private Compositor compositor;
    private LocalDate fechaLanzamiento;
    private Album album;
    private int calificacion;

    public Cancion(Genero genero, Artista artista, Compositor compositor, LocalDate fechaLanzamiento, Album album, int calificacion) {
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.album = album;
        this.calificacion = calificacion;
    }

    public Cancion(Genero genero, Artista artista, Compositor compositor, LocalDate fechaLanzamiento, int calificacion) {
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.album = album;
        this.calificacion = calificacion;
    }

    public Cancion(int id, Genero genero, Artista artista, Compositor compositor, LocalDate fechaLanzamiento, Album album, int calificacion) {
        this.id = id;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.album = album;
        this.calificacion = calificacion;
    }

    public Cancion() {
    }

    public int getId() {
        return id;
    }

    public Genero getGenero() {
        return genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public Album getAlbum() {
        return album;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "genero=" + genero +
                ", artista=" + artista +
                ", compositor=" + compositor +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", album=" + album +
                ", calificacion=" + calificacion +
                '}';
    }
}
