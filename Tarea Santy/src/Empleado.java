import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;


    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    //region Getter's and Setter's
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
//endregion
    public Venta vender(ArrayList<Articulo> listaArticulo) throws IOException {

        Venta venta = new Venta(this, listaArticulo, LocalDateTime.now());

        venta.imprimirTickect();
        return venta;

    }





}
