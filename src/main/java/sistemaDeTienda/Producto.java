
package sistemaDeTienda;


public abstract class  Producto implements Vendible{
    
    private final Double IVA = 0.21;
    
    private String nombre;
    private Double precioBase;
    private Double cantCompra;
    
    public Producto() {
    }

    public Producto(String nombre, Double precioBase, Double cantCompra) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantCompra = cantCompra;
    }
    @Override
    public Double calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
}
