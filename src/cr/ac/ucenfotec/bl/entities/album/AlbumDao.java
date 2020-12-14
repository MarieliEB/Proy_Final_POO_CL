package cr.ac.ucenfotec.bl.entities.album;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.utils.Utilities;

public class AlbumDao implements IAlbumDao {
    @Override
    public ArrayList<Album> listarAlbum() throws Exception {
        ArrayList<Album> album = null;
        ResultSet rs = null;
        try{
            AccesoBD accesoDatos;
            String query = "SELECT NOMBRE, FECHA_LANZAMIENTO, IMAGEN, ID_CLIENTE FROM ALBUM";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);
            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()){
                Album tmpAdministrativo = new Album(rs.getString("NOMBRE"), rs.getDate("FECHA_LANZAMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        rs.getString("IMAGEN"), rs.getInt("ID_CLIENTE"));
                if(album==null){
                    album = new ArrayList<>();
                }
                album.add(tmpAdministrativo);
            }
            return album;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarAlbum(Album a) throws Exception {
        try{
            String query = "INSERT INTO ALBUM (NOMBRE, FECHA_LANZAMIENTO, IMAGEN, ID_CLIENTE) " +
                    "VALUES ('" + a.getNombre() + "','" + a.getImagen() + "','"  + a.getFechaLanzamiento() + "','" + a.getImagen() + "')";
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
        }
    }

    @Override
    public void actualizarAlbum(Album c) throws Exception {

    }

    @Override
    public void borrarAlbum(String nombre) throws Exception {

    }
}
