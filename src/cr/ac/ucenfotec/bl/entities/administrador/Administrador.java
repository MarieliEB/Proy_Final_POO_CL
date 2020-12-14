package cr.ac.ucenfotec.bl.entities.administrador;

import cr.ac.ucenfotec.bl.Usuario;

/** Clase para la creacion del administrador extiende de Usuario
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Administrador extends Usuario {

    //Constructor
    public Administrador(String imagen, String correoElectronico, String nombreUsuario, String contrasenna) {
        super(imagen, correoElectronico, nombreUsuario, contrasenna);
    }
}
