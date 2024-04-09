
package herenciaPolimorfismo;


public class Gerente extends Empleado{
    
    
    private double bonoAnual;

    public Gerente() {
    }

    public Gerente(double bonoAnual, long id_empleado, String nombre, String apellido, String dni, double salario_mensual) {
        super(id_empleado, nombre, apellido, dni, salario_mensual);
        this.bonoAnual = bonoAnual;
    }
     @Override
     public double calcularSalarioAnual(){
         return super.calcularSalarioAnual() + bonoAnual;
     }

    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonoAnual=" + bonoAnual + '}';
    }

  

  
    

   
     
     
    
    
}
