package cr.ac.ucenfotec.bl.entities.cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.bl.entities.artista.Artista;
import cr.ac.ucenfotec.utils.Utilities;

public class ClienteDao implements IClienteDao {
    @Override
    public ArrayList<Cliente> listarCliente() throws Exception {
        ArrayList<Cliente> cliente = null;
        ResultSet rs = null;

        try{
            AccesoBD accesoDatos;
            String query = "SELECT IMAGEN, CORREO, NOMBRE_USUARIO, CONTRASENNA, NOMBRE, APELLIDO_UNO, APELLIDO_DOS, FECHA_NACIMIENTO, PAIS, IDENTIFICACION FROM CLIENTE";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);

            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()) {
                Cliente tmpCliente = new Cliente(   rs.getString("IMAGEN"),
                                                    rs.getString("CORREO"),
                                                    rs.getString("NOMBRE_USUARIO"),
                                                    rs.getString("CONTRASENNA"),
                                                    rs.getString("NOMBRE"),
                                                    rs.getString("APELLIDO_UNO"),
                                                    rs.getString("APELLIDO_DOS"),
                                                    rs.getDate("FECHA_NACIMIENTO").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                                                    rs.getString("PAIS"),
                                                    rs.getString("IDENTIFICACION"));
                if (cliente == null) {
                    cliente = new ArrayList<>();
                }
                cliente.add(tmpCliente);
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return cliente;
    }

    @Override
    public void registrarCliente(Cliente c) throws Exception {
        try{
            String query = "INSERT INTO CLIENTE (IMAGEN, CORREO, NOMBRE_USUARIO, CONTRASENNA, NOMBRE, APELLIDO_UNO, APELLIDO_DOS, FECHA_NACIMIENTO, PAIS, IDENTIFICACION) " +
                    "VALUES ('" + c.getImagen() + "','" + c.getCorreoElectronico() + "','"  + c.getNombreUsuario() + "','" + c.getContrasenna() + c.getNombre() + "','"
                    + c.getApellidoUno() + "','" + c.getApellidoDos() +  c.getFechaNacimiento() + "','" + c.getPaisProcedencia() + "','"
                    + c.getIdentificacion() + "','" + "')";
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
        }
    }

    @Override
    public void actualizarCliente(Cliente c) throws Exception {
        try {
            String query =  "UPDATE CLIENTE SET IMAGEN = '" +  c.getImagen()
                    + "', CORREO = '" + c.getCorreoElectronico() + "', NOMBRE_USUARIO = '" + c.getNombreUsuario()
                    + "', CONTRASENNA = '" + c.getContrasenna() + "', NOMBRE = '" + c.getNombre()
                    + "', APELLIDO_UNO = '" + c.getApellidoUno() + "', APELLIDO_DOS = '" + c.getApellidoDos()
                    + "', PAIS = '" + c.getPaisProcedencia()
                    + "' WHERE IDENTIFICACION = '" + c.getIdentificacion();
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void borrarCliente(String id) throws Exception {
        try {
            String query =  "DELETE FROM CLIENTE  WHERE IDENTIFICACION = '" + id;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
