import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ventas {


    private Empleados emplado;
private ArrayList<Producto> listaProductos;

    public Empleados getEmplado() {
        return emplado;
    }

    public Ventas(Empleados empleados, ArrayList<Producto> listaProductos, LocalDateTime fechaHora) {
        this.emplado = emplado;
        this.listaProductos = listaProductos;
        this.fechaHora = fechaHora;
    }

    public void setEmplado(Empleados emplado) {
        this.emplado = emplado;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    private LocalDateTime fechaHora;

    public void imprimirticket () throws IOException {
        FileWriter escritor = new FileWriter("./"+LocalDateTime.now().getYear()+"-"
                                                    +LocalDateTime.now().getMonthValue(),false);
        //precio,marca,el precio total
        
    }
}

