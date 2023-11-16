import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

    private Empleado empleado;
    private ArrayList<Articulo> listaArticulo;
    private LocalDateTime fechaHora;

    public Venta(Empleado empleado, ArrayList<Articulo> listaArticulo, LocalDateTime fechaHora) {
        this.empleado = empleado;
        this.listaArticulo = listaArticulo;
        this.fechaHora = fechaHora;
    }

    //region Getter's and Setter's
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Articulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(ArrayList<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    //endregion

    public void imprimirTickect () throws IOException {

        FileWriter escritor = new FileWriter(" ---Ticket--- "
                                            + LocalDateTime.now().getYear() + "/"
                                            + LocalDateTime.now().getMonthValue() + "/"
                                            + LocalDateTime.now().getDayOfMonth() + " | "
                                            + "<"+LocalDateTime.now().getHour() + "-"
                                            + LocalDateTime.now().getMinute() + "-"
                                            + LocalDateTime.now().getSecond()+">", false);


        String acumulador = "";
        double total = 0;

        for ( Articulo art : this.listaArticulo) {

            acumulador = acumulador.concat(" NOMBRE: " + art.getNombre() + "\n"
                    + "MARCA: " + art.getMarca() + "\n"
                    + "PRECIO: " + art.getPrecio());
            total = total + art.getPrecio();
        }

        acumulador = acumulador.concat("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        acumulador = acumulador.concat("TOTAL: "+ total );

        escritor.write(acumulador);
        escritor.close();



    }




}
