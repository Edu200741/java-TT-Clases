
package logica;


public class Automovil {
    
    private String marca;
    private String modelo;
    private double velocidadActual;
    private double combustible;
    
    public Automovil(String marca,String modelo,double velocidadActual,double combustible){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
        this.combustible = combustible;
        
    }
    
    public void acelerar(double aceleracion){
        if(combustible > 0){
            velocidadActual += aceleracion;
            System.out.println("El automovil ha acelerado. Su velocidad actual es: " + velocidadActual + "km/h");
            combustible -=0.1;
        }else{
            System.out.println("El automovil se a quedado sin combustible.");
        }
        
    }
    
    public void frenar(double desAceleracion){
        if(velocidadActual > 0){
            velocidadActual -=desAceleracion;
        }else{
            System.out.println("El automovil esta detenido.");
        }
        System.out.println("El automivil ha frenado. velocidad actual: " + velocidadActual);
    }
    
    public void mostrarInformacion(){
        
        System.out.println("La marca del vehiculo es : " + marca);
        System.out.println("El modelo del vehiculo es : " + modelo);
        System.out.println("La velocidad actual es: " + velocidadActual + "Km/h");
        System.out.println("La cantidad de combustible restante es : " + combustible + "Lt");
    }
}
