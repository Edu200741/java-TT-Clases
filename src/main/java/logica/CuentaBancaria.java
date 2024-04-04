
package logica;


public class CuentaBancaria {
    
    private int id;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    
    
    
    public void depositar(double deposito){
      
     saldo += deposito;
        System.out.println("Se depositaron "+ deposito + "pesos." );
    }
        
    public void retirar(double retiro){
       if(retiro<=saldo){
           saldo-=retiro;
           System.out.println("se extrajeron "+ saldo + "pesos");
       }else{
           System.out.println("No cuenta con saldo suficiente para realizar esta operacion");
       }
    }
        public double consultarSaldo(){
            return saldo;
        }
    
}
