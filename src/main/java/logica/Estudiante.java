
package logica;




public class Estudiante {
    private int edad;
    private String nombre;
    private double[] calificaciones;
    
    public  Estudiante(int edad,String nombre,double[] calificaciones){
        this.edad=edad;
        this.nombre=nombre;
        this.calificaciones=calificaciones;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    
    
    
    public double calcularPromedio(){
        if(calificaciones.length==0){
            return 0.0;
        }
        double promedio = 0.0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        return promedio = promedio/calificaciones.length;
    }
    
    
}
