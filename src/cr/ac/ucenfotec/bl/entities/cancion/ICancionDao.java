package cr.ac.ucenfotec.bl.entities.cancion;

import cr.ac.ucenfotec.bl.entities.artista.Artista;

import java.util.ArrayList;

public interface ICancionDao {
    ArrayList<Cancion> listarCancion() throws Exception;
    void registrarCancion(Cancion c) throws Exception;
    void actualizarCancion(Cancion a) throws Exception;
    void borrarCancion(int id) throws Exception;
}
