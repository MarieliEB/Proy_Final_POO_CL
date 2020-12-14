package cr.ac.ucenfotec.bl.entities.artista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.bl.entities.album.Album;
import cr.ac.ucenfotec.utils.Utilities;

public class ArtistaDao implements IArtistaDao {
    @Override
    public ArrayList<Artista> listarArtista() throws Exception {
        ArrayList<Artista> artista = null;
        ResultSet rs = null;
        try{
            AccesoBD accesoDatos;
            String query = "SELECT NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, PAIS_NACIMIENTO, GENERO, EDAD, DESCRIPCION FROM ARTISTA";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);
            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()){
                Album tmpArtista = new Artista(rs.getString("NOMBRE"), rs.getString("APELLIDO"), rs.getString("NOMBRE_ARTISTICO"),
                        rs.getDate("FECHA_NACIMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), rs.getDate("FECHA_DEFUNCION").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        rs.getString("PAIS_NACIMIENTO"), rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("DESCRIPCION"));
                if(artista==null){
                    artista = new ArrayList<>();
                }
                artista.add(tmpArtista);
            }
            return artista;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarArtista(Artista a) throws Exception {
        try{
            String query = "INSERT INTO ARTISTA (NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, PAIS_NACIMIENTO, GENERO, EDAD, DESCRIPCION) " +
                    "VALUES ('" + a.getNombre() + "','" + a.getApellido() + "','"  + a.getNombreArtistico() + "','" + a.getFechaNacimiento() + "','" + a.getFechaDefuncion()
            + "','" + a.getPaisNacimiento() + "','" + a.getGenero() + "','" + a.getEdad() + "','" + a.getDescripcion()+ "')";
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
        }
    }

    @Override
    public void actualizarArtista(Artista a) throws Exception {

    }

    @Override
    public void borrarArtista(String nombre) throws Exception {

    }
}
