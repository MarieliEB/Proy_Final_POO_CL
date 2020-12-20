package cr.ac.ucenfotec.bl.entities.cliente;

import cr.ac.ucenfotec.bl.Usuario;

import java.time.LocalDate;

/** Clase para la creacion de clientes registrados en el sistema extiende de Usuario
 * @author  Elizabeth Espinoza
 * @version  1.0
 **/

public class Cliente extends Usuario {

    private String nombre;
    private String apellidoUno;
    private String apellidoDos;
    private LocalDate fechaNacimiento;
    private String paisProcedencia;
    private String identificacion;
    private String codigoVerificacion;

    //Constructor
    public Cliente(String imagen, String correoElectronico, String nombreUsuario, String contrasenna, String nombre, String apellidoUno, String apellidoDos, LocalDate fechaNacimiento, String paisProcedencia, String identificacion, String codigoVerificacion) {
        super(imagen, correoElectronico, nombreUsuario, contrasenna);
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.fechaNacimiento = fechaNacimiento;
        this.paisProcedencia = paisProcedencia;
        this.identificacion = identificacion;
        this.codigoVerificacion = codigoVerificacion;
    }

    public Cliente( String identificacion) {
        this.identificacion = identificacion;
    }

    public Cliente(String nombre, String apellidoUno, String apellidoDos, String identificacion){
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.identificacion = identificacion;
    }

    public Cliente(String imagen, String correoElectronico, String nombreUsuario, String contrasenna, String nombre, String apellidoUno, String apellidoDos, LocalDate fechaNacimiento, String paisProcedencia, String identificacion) {
        super(imagen, correoElectronico, nombreUsuario, contrasenna);
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.fechaNacimiento = fechaNacimiento;
        this.paisProcedencia = paisProcedencia;
        this.identificacion = identificacion;
    }

    public Cliente(String nombre, String apellidoUno, String apellidoDos, LocalDate fechaNacimiento, String  paisProcedencia, String identificacion, String codigoVerificacion) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.fechaNacimiento = fechaNacimiento;
        this.paisProcedencia = paisProcedencia;
        this.identificacion = identificacion;
        this.codigoVerificacion = codigoVerificacion;
    }

    public Cliente() {
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    //toString

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidoUno='" + apellidoUno + '\'' +
                ", apellidoDos='" + apellidoDos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", paisProcedencia=" + paisProcedencia +
                ", identificacion='" + identificacion + '\'' +
                ", codigoVerificacion='" + codigoVerificacion + '\'' +
                '}';
    }
}
