
package herenciaPolimorfismo;


public class Desarrollador extends Empleado{
    
    
    private String lenguajeProgramacion;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProgramacion, long id_empleado, String nombre, String apellido, String dni, double salario_mensual) {
        super(id_empleado, nombre, apellido, dni, salario_mensual);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

   

    @Override
    public double calcularSalarioAnual(){
        return super.calcularSalarioAnual();
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return "Desarrollador{" + "lenguajeProgramacion=" + lenguajeProgramacion + '}';
    }

   
    
}
