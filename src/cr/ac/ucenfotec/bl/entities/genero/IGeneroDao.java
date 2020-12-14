package cr.ac.ucenfotec.bl.entities.genero;

import cr.ac.ucenfotec.bl.entities.cancion.Cancion;

import java.util.ArrayList;

public interface IGeneroDao {
    ArrayList<Genero> listarGenero() throws Exception;
    void registrarGenero(Genero g) throws Exception;
    void actualizarGenero(Genero g) throws Exception;
    void borrarGenero(String nombre) throws Exception;
}
