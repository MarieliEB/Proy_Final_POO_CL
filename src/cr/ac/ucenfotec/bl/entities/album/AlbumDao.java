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
            String query = "SELECT ID, NOMBRE, FECHA_LANZAMIENTO, IMAGEN, ID_CLIENTE FROM ALBUM";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);
            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()){
                Album tmpAlbum = new Album( rs.getInt("ID"),
                                            rs.getString("NOMBRE"),
                                            rs.getDate("FECHA_LANZAMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                                            rs.getString("IMAGEN"),
                                            rs.getInt("ID_CLIENTE"));
                if(album==null){
                    album = new ArrayList<>();
                }
                album.add(tmpAlbum);
            }
            return album;
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return album;
    }

    @Override
    public void registrarAlbum(Album a) throws Exception {
        try{
            String query = "INSERT INTO ALBUM (NOMBRE, FECHA_LANZAMIENTO, IMAGEN, ID_CLIENTE) " +
                    "VALUES ('" + a.getNombre() +  "','"  + a.getFechaLanzamiento() + "','" + a.getImagen() + "','" + a.getIdCliente() + "')";
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void actualizarAlbum(Album a) throws Exception {
        try {
            String query =  "UPDATE ALBUM SET  NOMBRE = '" + a.getNombre() + "',FECHA_LANZAMIENTO = '" +  a.getFechaLanzamiento()
                    + "', IMAGEN = '" + a.getImagen() + "', ID_CLIENTE = '" + a.getIdCliente()
                    + "' WHERE ID = '" + a.getId();
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void borrarAlbum(int id) throws Exception {
        try {
            String query =  "DELETE FROM ALBUM   WHERE ID = '" + id;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
