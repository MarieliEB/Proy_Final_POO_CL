package cr.ac.ucenfotec.bl;

import cr.ac.ucenfotec.bl.Cancion;
import cr.ac.ucenfotec.bl.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

/** Clase para la creacion de las listas de reproduccion
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class ListaDeReproduccion {

    private ArrayList<Cancion> canciones;
    private LocalDate fechaDeCreacion;
    private String nombre;
    private double calificacion;
    private Cliente cliente;

    public ListaDeReproduccion(ArrayList<Cancion> canciones, LocalDate fechaDeCreacion, String nombre, double calificacion, Cliente cliente) {
        this.canciones = canciones;
        this.fechaDeCreacion = fechaDeCreacion;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.cliente = cliente;
    }

    public ListaDeReproduccion() {
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ListaDeReproduccion{" +
                "canciones=" + canciones +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                ", cliente=" + cliente +
                '}';
    }
}

