public class Empleado extends Persona {

    private int id;
    private double sueldo;

    public Empleado(int id, double sueldo, String nombre, String apellido, String dni, String nacionalidad) {
        super(nombre, apellido, dni, nacionalidad);
        this.id = id;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", sueldo=" + sueldo +
                '}'+ super.toString();
    }
}




