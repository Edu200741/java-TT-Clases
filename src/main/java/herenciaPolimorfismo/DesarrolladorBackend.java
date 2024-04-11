
package herenciaPolimorfismo;


public class DesarrolladorBackend extends Desarrollador {
    
    private String tecnologiasFront;
    private double premioMensual;

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual()+ premioMensual; 
    }
    
    
    
    

    public DesarrolladorBackend() {
    }

    public DesarrolladorBackend(String tecnologiasFront, double premioMensual, String lenguajeProgramacion, long id_empleado, String nombre, String apellido, String dni, double salario_mensual) {
        super(lenguajeProgramacion, id_empleado, nombre, apellido, dni, salario_mensual);
        this.tecnologiasFront = tecnologiasFront;
        this.premioMensual = premioMensual;
    }

    public String getTecnologiasFront() {
        return tecnologiasFront;
    }

    public void setTecnologiasFront(String tecnologiasFront) {
        this.tecnologiasFront = tecnologiasFront;
    }

    public double getPremioMensual() {
        return premioMensual;
    }

    public void setPremioMensual(double premioMensual) {
        this.premioMensual = premioMensual;
    }

    @Override
    public String toString() {
        return "DesarrolladorBackend{" + "tecnologiasFront=" + tecnologiasFront + ", premioMensual=" + premioMensual + '}';
    }
    
    
    
    
    

    
    
    
    
    
   
    
    
}
