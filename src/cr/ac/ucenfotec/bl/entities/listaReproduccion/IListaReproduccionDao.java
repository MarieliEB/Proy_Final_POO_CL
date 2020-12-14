package cr.ac.ucenfotec.bl.entities.listaReproduccion;

import java.util.ArrayList;

public interface IListaReproduccionDao {
    ArrayList<ListaDeReproduccion> listarListaDeReproduccion() throws Exception;
    void registrarListaDeReproduccion(ListaDeReproduccion lr) throws Exception;
    void actualizarListaDeReproduccion(ListaDeReproduccion lr) throws Exception;
    void borrarListaDeReproduccion(String nombre) throws Exception;
}
