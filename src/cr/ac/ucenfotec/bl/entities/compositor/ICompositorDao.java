package cr.ac.ucenfotec.bl.entities.compositor;

import cr.ac.ucenfotec.bl.entities.cliente.Cliente;

import java.util.ArrayList;

public interface ICompositorDao {
    ArrayList<Compositor> listarCompositor() throws Exception;
    void registrarCompositor(Compositor c) throws Exception;
    void actualizarCompositor(Compositor c) throws Exception;
    void borrarCompositor(int id) throws Exception;
}
