
package sistemaDeTienda;


public class Ropa extends Producto{
    
    private String temporada;
    private int cantStock;

    

    public Ropa() {
    }

    public Ropa(String temporada, int cantStock, String nombre, Double precioBase, Double cantCompra) {
        super(nombre, precioBase, cantCompra);
        this.temporada = temporada;
        this.cantStock = cantStock;
    }
    

    

    @Override
    public Double calcularPrecio(Ropa ropa){
        
       
        
       
    
    }
    
   
    
    
    
    
    
    
}
