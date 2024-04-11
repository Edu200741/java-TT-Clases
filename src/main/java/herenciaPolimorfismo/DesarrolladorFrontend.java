
package herenciaPolimorfismo;


public class DesarrolladorFrontend extends Desarrollador {
    
    private String tecnologiasBack;
    private double premioMensual;

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual()+premioMensual; 
    }
    
    
    
    

    public DesarrolladorFrontend() {
    }

    public DesarrolladorFrontend(String tecnologiasBack, double premioMensual, String lenguajeProgramacion, long id_empleado, String nombre, String apellido, String dni, double salario_mensual) {
        super(lenguajeProgramacion, id_empleado, nombre, apellido, dni, salario_mensual);
        this.tecnologiasBack = tecnologiasBack;
        this.premioMensual = premioMensual;
    }

    public String getTecnologiasBack() {
        return tecnologiasBack;
    }

    public void setTecnologiasBack(String tecnologiasBack) {
        this.tecnologiasBack = tecnologiasBack;
    }

    public double getPremioMensual() {
        return premioMensual;
    }

    public void setPremioMensual(double premioMensual) {
        this.premioMensual = premioMensual;
    }

    @Override
    public String toString() {
        return "DesarrolladorFrontend{" + "tecnologiasBack=" + tecnologiasBack + ", premioMensual=" + premioMensual + '}';
    }
    
    
    
    
    

   
    
    
    
}
