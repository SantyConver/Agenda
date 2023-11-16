
public class Producto {
    private int codigo;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private double precio;

    public Producto(int codigo, String marca, double precio, String nombre) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
    }

    private String nombre;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
