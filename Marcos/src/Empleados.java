import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private String apellido;

    public Empleados(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

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

    private String dni;
    public Ventas vender(ArrayList<Producto>listaProducto){
        Ventas venta = new Ventas(this, listaProducto, LocalDateTime.now());
        //venta.imprimirTicket();
        return venta;

    }
}
