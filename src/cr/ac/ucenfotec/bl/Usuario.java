package cr.ac.ucenfotec.bl;

/** Clase para la creacion de usuarios del sistema
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Usuario {

    private String imagen;
    private String correoElectronico;
    private String nombreUsuario;
    private String contrasenna;

    //Constructors
    public Usuario(String imagen, String correoElectronico, String nombreUsuario, String contrasenna) {
        this.imagen = imagen;
        this.correoElectronico = correoElectronico;
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }

    public Usuario() {
    }

    //Getter
    public String getImagen() {
        return imagen;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    //Setter
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    //ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "imagen='" + imagen + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                '}';
    }

}
