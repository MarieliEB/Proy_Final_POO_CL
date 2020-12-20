package cr.ac.ucenfotec.bl.entities.listaReproduccion;

import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.bl.entities.cliente.Cliente;
import cr.ac.ucenfotec.utils.Utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;

public class ListaReproduccionDao implements IListaReproduccionDao{

    @Override
    public ArrayList<ListaDeReproduccion> listarListaDeReproduccion() throws Exception {
        ArrayList<ListaDeReproduccion> ldr = null;
        ResultSet rs = null;
        try{
            AccesoBD accesoDatos;

            String query = "SELECT ID, FECHA_CREACION, NOMBRE, CALIFICACION, ID_CLIENTE, " +
                    " FROM LISTA_REPRODUCCION";
            accesoDatos= Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]);
            rs = accesoDatos.ejecutarSQL(query);
            //recorrer el rs
            while (rs.next()){
                if(ldr==null){
                    ldr = new ArrayList<>();
                }
                Cliente tmpCliente = new Cliente( rs.getString("ID_CLIENTE"));
                ListaDeReproduccion tmpLDR = new ListaDeReproduccion( rs.getInt("ID"),
                        rs.getDate("FECHA_CREACION").toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        rs.getString("NOMBRE"),
                        rs.getInt("CALIFICACION"),
                        tmpCliente);

                ldr.add(tmpLDR);
            }
            return ldr;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void registrarListaDeReproduccion(ListaDeReproduccion lr) throws Exception {
        try{
            String query = "INSERT INTO LISTA_REPRODUCCION (FECHA_CREACION, NOMBRE, CALIFICACION, ID_CLIENTE) " +
                    "VALUES ('" + lr.getFechaDeCreacion() +  "','"  + lr.getNombre() + "','" + lr.getCalificacion() + "','" + lr.getCliente().getIdentificacion() + "')";
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
    public void actualizarListaDeReproduccion(ListaDeReproduccion lr) throws Exception {
    }

    @Override
    public void borrarListaDeReproduccion(int id) throws Exception {
        try {
            String query =  "DELETE FROM LISTA_REPRODUCCION  WHERE ID = '" + id;

            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
