package cr.ac.ucenfotec.bl.entities.genero;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.bl.entities.compositor.Compositor;
import cr.ac.ucenfotec.utils.Utilities;

public class GeneroDao implements IGeneroDao {
    @Override
    public ArrayList<Genero> listarGenero() throws Exception {
        ArrayList<Genero> generos = null;
        ResultSet rs = null;

        try{
            AccesoBD accesoDatos;
            String query = "SELECT NOMBRE, DESCRIPCION FROM GENERO";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);

            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()) {
                if (generos == null) {
                    generos = new ArrayList<>();
                }
                Genero tmpGenero = new Genero(   rs.getString("NOMBRE"),
                                                 rs.getString("DESCRIPCION"));
                generos.add(tmpGenero);
            }
            return generos;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarGenero(Genero g) throws Exception {
        try{
            String query = "INSERT INTO GENERO (NOMBRE, DESCRIPCION) "
                    + "VALUES ('" + g.getNombre()  + g.getDescripcion()+ "')";

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void actualizarGenero(Genero g) throws Exception {
        try {
            String query =  "UPDATE GENERO SET DESCRIPCION = '" + g.getDescripcion()
                    + "' WHERE NOMBRE = '" + g.getNombre();

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void borrarGenero(String nombre) throws Exception {
        try {
            String query =  "DELETE FROM GENERO WHERE NOMBRE = '" + nombre;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            throw e;
        }
    }
}
