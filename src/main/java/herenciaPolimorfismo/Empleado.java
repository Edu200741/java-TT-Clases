package herenciaPolimorfismo;

public class Empleado {

    private long id_empleado;
    private String nombre;
    private String apellido;
    private String dni;
    private double salario_mensual;

    public double calcularSalarioAnual() {
        return salario_mensual * 12;
    }

    public Empleado() {
    }

    public Empleado(long id_empleado, String nombre, String apellido, String dni, double salario_mensual) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario_mensual = salario_mensual;
    }

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
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

    public double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", salario_mensual=" + salario_mensual + '}';
    }

}
