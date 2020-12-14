package cr.ac.ucenfotec.bl.entities.artista;

import cr.ac.ucenfotec.bl.entities.album.Album;

import java.util.ArrayList;

public interface IArtistaDao {
    ArrayList<Artista> listarArtista() throws Exception;
    void registrarArtista(Artista a) throws Exception;
    void actualizarArtista(Artista a) throws Exception;
    void borrarArtista(String nombre) throws Exception;
}
