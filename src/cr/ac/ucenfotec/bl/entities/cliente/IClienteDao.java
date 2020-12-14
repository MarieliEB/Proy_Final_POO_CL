package cr.ac.ucenfotec.bl.entities.cliente;

import cr.ac.ucenfotec.bl.entities.cancion.Cancion;

import java.util.ArrayList;

public interface IClienteDao {
    ArrayList<Cliente> listarCliente() throws Exception;
    void registrarCliente(Cliente c) throws Exception;
    void actualizarCliente(Cliente c) throws Exception;
    void borrarCliente(String id) throws Exception;
}
