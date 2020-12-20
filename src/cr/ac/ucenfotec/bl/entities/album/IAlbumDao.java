package cr.ac.ucenfotec.bl.entities.album;

import java.util.ArrayList;

public interface IAlbumDao {
    ArrayList<Album> listarAlbum() throws Exception;
    void registrarAlbum(Album c) throws Exception;
    void actualizarAlbum(Album c) throws Exception;
    void borrarAlbum(int id) throws Exception;
}
