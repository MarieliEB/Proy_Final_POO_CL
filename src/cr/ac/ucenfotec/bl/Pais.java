package cr.ac.ucenfotec.bl;

/** Clase para la creacion de paises
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Pais {
    private String Pais;

    //Constructor
    public Pais(String pais) {
        Pais = pais;
    }

    //Getter
    public String getPais() {
        return Pais;
    }

    //Setter
    public void setPais(String pais) {
        Pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return "Pais{" +
                "Pais='" + Pais + '\'' +
                '}';
    }
}
