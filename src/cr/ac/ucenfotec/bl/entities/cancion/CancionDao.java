package cr.ac.ucenfotec.bl.entities.cancion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.bl.entities.album.Album;
import cr.ac.ucenfotec.bl.entities.artista.Artista;
import cr.ac.ucenfotec.bl.entities.compositor.Compositor;
import cr.ac.ucenfotec.bl.entities.genero.Genero;
import cr.ac.ucenfotec.utils.Utilities;

public class CancionDao implements ICancionDao {
    @Override
    public ArrayList<Cancion> listarCancion() throws Exception {
        ArrayList<Cancion> canciones = null;
        ResultSet rs = null;
        try{
            AccesoBD accesoDatos;

            String query = "SELECT ID, GENERO, ARTISTA_NOMBRE, COMPOSITOR_NOMBRE" +
                    " FECHA_LANZAMIENTO, NOMBRE_ALBUM, CALIFICACION" +
                    " FROM CANCION";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);
            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()){
                if(canciones==null){
                    canciones = new ArrayList<>();
                }
                Genero tmpGenero = new Genero(rs.getString("GENERO"));
                Artista tmpArtista = new Artista(rs.getString("ARTISTA_NOMBRE"));
                Compositor tmpCompositor = new Compositor(rs.getString("COMPOSITOR_NOMBRE"));
                Album tmpAlbum = new Album(rs.getString("NOMBRE_ALBUM"));
                Cancion tmpCancion = new Cancion(rs.getInt("ID"),
                                     tmpGenero, tmpArtista, tmpCompositor,
                                     rs.getDate("FECHA_LANZAMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                                     tmpAlbum, rs.getInt("CALIFICACION"));

                canciones.add(tmpCancion);
            }
            return canciones;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarCancion(Cancion c) throws Exception {
        try{
            String query = "INSERT INTO CANCION (GENERO, ARTISTA_NOMBRE, COMPOSITOR_NOMBRE, FECHA_LANZAMIENTO, NOMBRE_ALBUM, CALIFICACION) " +
                    "VALUES ('" + c.getGenero() +  "','"  + c.getArtista().getNombre() + "','" + c.getCompositor().getNombre() + "','" +
                    c.getFechaLanzamiento()  + c.getAlbum().getNombre() + "','" + c.getCalificacion() + "')";
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
    public void actualizarCancion(Cancion c) throws Exception {
        try {
            String query =  "UPDATE CANCION SET CALIFICACION = '" +   c.getCalificacion()
                    + "' WHERE  ID = '" + c.getId();

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void borrarCancion(int id) throws Exception {
        try {
            String query =  "DELETE FROM CANCION  WHERE ID = '" + id;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
