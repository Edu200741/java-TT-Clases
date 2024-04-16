
package MascotaVirtual;


public class Mascota extends MetodosMascota{
    /*
    final MAX_ENERGIA = 100
    final MIN_ENERGIA = 0

    nombre: string
    energia: entero ;
    peso : doble
    dormido: booleano
    humor: entero 1😞 2😒 3😐 4😊 5😎
    cantComer: entero
    */
   
    
    private String nombre;
    private int energia;
    private Double peso;
    private boolean dormido;
    private int humor; 
    private int cantComer;

    public Mascota() {
    }

    public Mascota(String nombre, int energia, Double peso, boolean dormido, int humor, int cantComer) {
        this.nombre = nombre;
        this.energia = energia;
        this.peso = peso;
        this.dormido = dormido;
        this.humor = humor;
        this.cantComer = cantComer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getCantComer() {
        return cantComer;
    }

    public void setCantComer(int cantComer) {
        this.cantComer = cantComer;
    }

    
    
    
    
    
    
}
