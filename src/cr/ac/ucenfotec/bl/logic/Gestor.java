package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.administrador.Administrador;
import cr.ac.ucenfotec.bl.entities.administrador.IAdministrativoDao;
import cr.ac.ucenfotec.bl.entities.album.Album;
import cr.ac.ucenfotec.bl.entities.album.IAlbumDao;
import cr.ac.ucenfotec.bl.entities.artista.Artista;
import cr.ac.ucenfotec.bl.entities.artista.IArtistaDao;
import cr.ac.ucenfotec.bl.entities.cancion.Cancion;
import cr.ac.ucenfotec.bl.entities.cancion.ICancionDao;
import cr.ac.ucenfotec.bl.entities.cliente.Cliente;
import cr.ac.ucenfotec.bl.entities.cliente.IClienteDao;
import cr.ac.ucenfotec.bl.entities.compositor.Compositor;
import cr.ac.ucenfotec.bl.entities.compositor.ICompositorDao;
import cr.ac.ucenfotec.bl.entities.genero.Genero;
import cr.ac.ucenfotec.bl.entities.genero.IGeneroDao;
import cr.ac.ucenfotec.bl.entities.listaReproduccion.IListaReproduccionDao;
import cr.ac.ucenfotec.bl.entities.listaReproduccion.ListaDeReproduccion;
import cr.ac.ucenfotec.dao.DAOFactory;
import cr.ac.ucenfotec.utils.Utilities;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {

    //  **************************************   Album    **********************************************************************************

    public ArrayList<Album> getAlbum() throws Exception {
        try {
            ArrayList<Album> albums =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getAlbumDAO().listarAlbum();

            return albums;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarAlbum(String nombre, LocalDate fechaLanzamiento, String imagen, int idCliente) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IAlbumDao dao = factory.getAlbumDAO();
            dao.registrarAlbum(new Album(nombre, fechaLanzamiento, imagen, idCliente));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarAlbum(int id, String nombre, LocalDate fechaLanzamiento, String imagen, int idCliente) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IAlbumDao dao = factory.getAlbumDAO();
            dao.actualizarAlbum(new Album(id, nombre, fechaLanzamiento, imagen, idCliente));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarAlbum(int id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IAlbumDao dao = factory.getAlbumDAO();
            dao.borrarAlbum(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Artista   **********************************************************************************

    public ArrayList<Artista> getArtista() throws Exception {
        try {
            ArrayList<Artista> artistas =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getArtistaDAO().listarArtista();

            return artistas;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarArtista(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IArtistaDao dao = factory.getArtistaDAO();
            dao.registrarArtista(new Artista(nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarArtista(int id, String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IArtistaDao dao = factory.getArtistaDAO();
            dao.actualizarArtista(new Artista(id, nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarArtista(int id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IArtistaDao dao = factory.getArtistaDAO();
            dao.borrarArtista(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Compositor    **********************************************************************************

    public ArrayList<Compositor> getCompositor() throws Exception {
        try {
            ArrayList<Compositor> compositores =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getCompositorDAO().listarCompositor();

            return compositores;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarCompositor(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICompositorDao dao = factory.getCompositorDAO();
            dao.registrarCompositor(new Compositor(nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarCompositor(int id, String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisNacimiento, String genero, int edad, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICompositorDao dao = factory.getCompositorDAO();
            dao.actualizarCompositor(new Compositor(id, nombre, apellido, nombreArtistico, fechaNacimiento, fechaDefuncion, paisNacimiento, genero, edad, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarCompositor(int id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICompositorDao dao = factory.getCompositorDAO();
            dao.borrarCompositor(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Cancion    **********************************************************************************

    public ArrayList<Cancion> getCancion() throws Exception {
        try {
            ArrayList<Cancion> canciones =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getCancionDAO().listarCancion();

            return canciones;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarCancion(String genero, String artista, String compositor, LocalDate fechaLanzamiento, int calificacion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICancionDao dao = factory.getCancionDAO();
            dao.registrarCancion(new Cancion(new Genero(genero), new Artista(artista) , new Compositor(compositor), fechaLanzamiento, calificacion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarCancion(int id, Genero genero, Artista artista, Compositor compositor, LocalDate fechaLanzamiento, Album album, int calificacion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICancionDao dao = factory.getCancionDAO();
            dao.actualizarCancion(new Cancion(id, genero, artista, compositor, fechaLanzamiento, album, calificacion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarCancion(int id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            ICancionDao dao = factory.getCancionDAO();
            dao.borrarCancion(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Cliente    **********************************************************************************

    public String[] getCliente() throws Exception {
        try {
            ArrayList<Cliente> clientes =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getClienteDAO().listarCliente();
            String [] info = new String[clientes.size()];
            int pos = 0;
            for(Cliente c : clientes){
                info[pos] = c.toString();
            }
            return info;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarCliente(String imagen, String correoElectronico, String nombreUsuario, String contrasenna, String nombre, String apellidoUno,
                                 String apellidoDos, LocalDate fechaNacimiento, String paisProcedencia,
                                 String identificacion, String codigoVerificacion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IClienteDao dao = factory.getClienteDAO();
            dao.registrarCliente(new Cliente(imagen, correoElectronico, nombreUsuario, contrasenna, nombre, apellidoUno, apellidoDos, fechaNacimiento,
                    paisProcedencia, identificacion, codigoVerificacion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarCliente(String imagen, String correoElectronico, String nombreUsuario, String contrasenna, String nombre, String apellidoUno,
                                  String apellidoDos, LocalDate fechaNacimiento, String paisProcedencia,
                                  String identificacion, String codigoVerificacion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IClienteDao dao = factory.getClienteDAO();
            dao.actualizarCliente(new Cliente(imagen, correoElectronico, nombreUsuario, contrasenna, nombre, apellidoUno, apellidoDos, fechaNacimiento,
                    paisProcedencia, identificacion, codigoVerificacion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarCliente(String id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IClienteDao dao = factory.getClienteDAO();
            dao.borrarCliente(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   ListaReproduccion    **********************************************************************************

    public ArrayList<ListaDeReproduccion> getListaReproduccion() throws Exception {
        try {
            ArrayList<ListaDeReproduccion> ldr =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getListaReproduccionDao().listarListaDeReproduccion();

            return ldr;

        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarListaReproduccion(LocalDate fechaDeCreacion, String nombre, double calificacion, Cliente cliente) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IListaReproduccionDao dao = factory.getListaReproduccionDao();
            dao.registrarListaDeReproduccion(new ListaDeReproduccion(fechaDeCreacion, nombre, calificacion, cliente));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarListaReproduccion(int id, LocalDate fechaDeCreacion, String nombre, double calificacion, Cliente cliente) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IListaReproduccionDao dao = factory.getListaReproduccionDao();
            dao.actualizarListaDeReproduccion(new ListaDeReproduccion(id, fechaDeCreacion, nombre, calificacion, cliente));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarListaReproduccion(int id) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IListaReproduccionDao dao = factory.getListaReproduccionDao();
            dao.borrarListaDeReproduccion(id);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Genero    **********************************************************************************

    public ArrayList<Genero> getGenero() throws Exception {
        try {
            ArrayList<Genero> generos =  DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB())).getGeneroDAO().listarGenero();
            return generos;
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarGenero(String nombre, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IGeneroDao dao = factory.getGeneroDAO();
            dao.registrarGenero(new Genero(nombre, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void actualizarGenero(String nombre, String descripcion) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IGeneroDao dao = factory.getGeneroDAO();
            dao.actualizarGenero(new Genero(nombre, descripcion));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    public void eliminarGenero(String nombre) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IGeneroDao dao = factory.getGeneroDAO();
            dao.borrarGenero(nombre);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }

    //  **************************************   Administrador    **********************************************************************************

    public void registrarAdministrador(String imagen, String correoElectronico, String nombreUsuario, String contrasenna) throws Exception{
        try{
            DAOFactory factory = DAOFactory.getDaoFactory(Integer.parseInt(Utilities.getMotorDB()));
            IAdministrativoDao dao = factory.getAdministradorDAO();
            dao.registrarAdministrativo(new Administrador(imagen, correoElectronico, nombreUsuario, contrasenna));
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
            throw  e;
        }
    }
}
