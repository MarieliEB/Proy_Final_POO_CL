package cr.ac.ucenfotec.bl.entities.administrador;

import java.sql.SQLException;
import java.util.ArrayList;
import cr.ac.ucenfotec.accesodatos.AccesoBD;
import cr.ac.ucenfotec.accesodatos.Conector;
import cr.ac.ucenfotec.utils.Utilities;

public class AdministradorDao implements IAdministrativoDao{


    @Override
    public void registrarAdministrativo(Administrador a) throws Exception {
        try{
            String query = "INSERT INTO ADMINISTRADOR (IMAGEN, CORREO, NOMBRE_USUARIO, CONTRASENNIA) " +
                    "VALUES ('" + a.getImagen() + "','" + a.getCorreoElectronico() + "','"  + a.getNombreUsuario() + "','" + a.getContrasenna() + "')";
            Conector.getConnector(Utilities.getProperties()[0],Utilities.getProperties()[1]).ejecutarSQL(query);
        }
        catch (SQLException e){
            throw e;
        }
        catch (Exception e){
        }
    }
}
