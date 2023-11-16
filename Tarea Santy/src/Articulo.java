public class Articulo {

    private int codigo;
    private String marca;
    private String nombre;
    private double precio;


    public Articulo(int codigo, String marca, String nombre, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }

    //region Getter's and Setter's
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //endregion







}
