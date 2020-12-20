package cr.ac.ucenfotec.dao;


import cr.ac.ucenfotec.bl.entities.administrador.AdministradorDao;
import cr.ac.ucenfotec.bl.entities.administrador.IAdministrativoDao;
import cr.ac.ucenfotec.bl.entities.album.AlbumDao;
import cr.ac.ucenfotec.bl.entities.album.IAlbumDao;
import cr.ac.ucenfotec.bl.entities.artista.ArtistaDao;
import cr.ac.ucenfotec.bl.entities.artista.IArtistaDao;
import cr.ac.ucenfotec.bl.entities.cancion.CancionDao;
import cr.ac.ucenfotec.bl.entities.cancion.ICancionDao;
import cr.ac.ucenfotec.bl.entities.cliente.ClienteDao;
import cr.ac.ucenfotec.bl.entities.cliente.IClienteDao;
import cr.ac.ucenfotec.bl.entities.compositor.CompositorDao;
import cr.ac.ucenfotec.bl.entities.compositor.ICompositorDao;
import cr.ac.ucenfotec.bl.entities.genero.GeneroDao;
import cr.ac.ucenfotec.bl.entities.genero.IGeneroDao;
import cr.ac.ucenfotec.bl.entities.listaReproduccion.IListaReproduccionDao;
import cr.ac.ucenfotec.bl.entities.listaReproduccion.ListaReproduccionDao;

public class SqlServerDaoFactory extends DAOFactory{

    @Override
    public IAdministrativoDao getAdministradorDAO() {
        return new AdministradorDao();
    }

    @Override
    public IAlbumDao getAlbumDAO() {
        return new AlbumDao();
    }

    @Override
    public IArtistaDao getArtistaDAO() {
        return new ArtistaDao();
    }

    @Override
    public ICancionDao getCancionDAO() {
        return new CancionDao();
    }

    @Override
    public IClienteDao getClienteDAO() {
        return new ClienteDao();
    }

    @Override
    public ICompositorDao getCompositorDAO() {
        return new CompositorDao();
    }

    @Override
    public IGeneroDao getGeneroDAO() {
        return new GeneroDao();
    }

    @Override
    public IListaReproduccionDao getListaReproduccionDao() {
        return new ListaReproduccionDao();
    }

}
