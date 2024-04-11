
package herenciaPolimorfismo;


public class main {
    
    public static void main(String[] args) {
        
        Empleado emple = new Empleado(1L,"Carlos","made","546372882",300.5);
        Gerente geren = new Gerente(100.5,2L,"Leo","Gutierrez","65544567",500.5);
        Desarrollador desa = new Desarrollador("java",3L,"Edu","Made","6473882",500);
        DesarrolladorFrontend fron = new DesarrolladorFrontend();
        DesarrolladorBackend bac = new DesarrolladorBackend();
        
        
        System.out.println("El salario anual del Empleado es:"+ emple.calcularSalarioAnual()); 
        System.out.println("El salario anual del Gerente es:"+ geren.calcularSalarioAnual()); 
        System.out.println("El salario anual del Desarrollador es:"+ desa.calcularSalarioAnual()); 
      
        fron.setSalario_mensual(1000);
        fron.setPremioMensual(100);
        System.out.println("El salario anual del Desarrollador FrontEnd es: " + fron.calcularSalarioAnual());
        
        bac.setSalario_mensual(1500);
        bac.setPremioMensual(500);
        System.out.println("El salario anual del Desarrollador BackEnd es: " + bac.calcularSalarioAnual());
    }
}
