package cr.ac.ucenfotec.bl.entities.compositor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.utils.Utilities;

public class CompositorDao implements ICompositorDao {
    @Override
    public ArrayList<Compositor> listarCompositor() throws Exception {
        ArrayList<Compositor> compositores = null;
        ResultSet rs = null;

        try{
            AccesoBD accesoDatos;
            String query = "SELECT ID, NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, PAIS_NACIMIENTO, GENERO, EDAD, DESCRIPCION FROM COMPOSITOR";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);

            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()) {
                if (compositores == null) {
                    compositores = new ArrayList<>();
                }
                Compositor tmpArtista = new Compositor(   rs.getInt("ID"),
                        rs.getString("NOMBRE"),
                        rs.getString("APELLIDO"),
                        rs.getString("NOMBRE_ARTISTICO"),
                        rs.getDate("FECHA_NACIMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        rs.getDate("FECHA_DEFUNCION").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        rs.getString("PAIS_NACIMIENTO"),
                        rs.getString("GENERO"),
                        rs.getInt("EDAD"),
                        rs.getString("DESCRIPCION"));
                compositores.add(tmpArtista);
            }
            return compositores;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarCompositor(Compositor c) throws Exception {
        try{
            String query = "INSERT INTO COMPOSITOR (NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, PAIS_NACIMIENTO, GENERO, EDAD, DESCRIPCION) "
                    + "VALUES ('" + c.getNombre() + "','" + c.getApellido() + "','"  + c.getNombreArtistico() + "','" + c.getFechaNacimiento() + "','"
                    + c.getFechaDefuncion() + "','" + c.getPaisNacimiento() + "','" + c.getGenero() + "','" + c.getEdad() + "','" + c.getDescripcion()+ "')";

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void actualizarCompositor(Compositor c) throws Exception {
        try {
            String query =   "UPDATE COMPOSITOR SET NOMBRE = '" + c.getNombre() + "' AND  APELLIDO = '" + c.getApellido() + "',NOMBRE_ARTISTICO = '" +  c.getNombreArtistico() + "', FECHA_NACIMIENTO = '" + c.getFechaNacimiento()
                    + "', FECHA_DEFUNCION = '" + c.getFechaDefuncion() + "', PAIS_NACIMIENTO = '" + c.getPaisNacimiento()
                    +  "', GENERO = '" + c.getGenero() +  "', EDAD = '" + c.getEdad() +  "', DESCRIPCION = '" + c.getDescripcion()
                    + "' WHERE ID = '" + c.getId();

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void borrarCompositor(int id) throws Exception {
        try {
            String query =  "DELETE FROM COMPOSITOR WHERE ID = '" + id;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
