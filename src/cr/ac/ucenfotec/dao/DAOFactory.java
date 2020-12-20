package cr.ac.ucenfotec.dao;


import cr.ac.ucenfotec.bl.entities.administrador.IAdministrativoDao;
import cr.ac.ucenfotec.bl.entities.album.IAlbumDao;
import cr.ac.ucenfotec.bl.entities.artista.IArtistaDao;
import cr.ac.ucenfotec.bl.entities.cancion.ICancionDao;
import cr.ac.ucenfotec.bl.entities.cliente.IClienteDao;
import cr.ac.ucenfotec.bl.entities.compositor.ICompositorDao;
import cr.ac.ucenfotec.bl.entities.genero.IGeneroDao;
import cr.ac.ucenfotec.bl.entities.listaReproduccion.IListaReproduccionDao;

public abstract class DAOFactory {
    public static int MYSQL=1;
    public static int SQLSERVER=2;
    public static int TEXT_FILE = 3;

    public static DAOFactory getDaoFactory(int whichFactory){
        switch (whichFactory){
            case 1:
                //return new MySqlDaoFactory();
            case 2:
                return new SqlServerDaoFactory();
            case 3:
                return new TextFileDaoFactory();
            default:
                return null;
        }
    }

   public abstract IAdministrativoDao getAdministradorDAO();
    public abstract IAlbumDao getAlbumDAO();
    public abstract IArtistaDao getArtistaDAO();
    public abstract ICancionDao getCancionDAO();
    public abstract IClienteDao getClienteDAO();
    public abstract ICompositorDao getCompositorDAO();
    public abstract IGeneroDao getGeneroDAO();
    public abstract IListaReproduccionDao getListaReproduccionDao();

}
