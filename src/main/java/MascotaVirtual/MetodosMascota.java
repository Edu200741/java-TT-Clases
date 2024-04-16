package MascotaVirtual;

public class MetodosMascota {

    /*
    comer(): // aumenta energia, aumenta peso//
    dormir(): // dormir true//
    despertar(): // dormir false//
    caminar(): // disminuye energia, disminuye peso//
    correr(): // disminuye mucha energia, disminuye mucho peso//
    obtenerEnergia(): // aumenta energia
    estaVivo(): // devuelve true o false segun energia
     */
    private final int MAX_ENERGIA = 100;
    private final int MIN_ENERGIA = 0;

    public void comer(int energia, int cantComida, Double peso) {

        if (energia < MAX_ENERGIA && peso < 100 && cantComida < 100) {
            cantComida = +5;
            energia = +5;
            peso = +5.0;
        } else {
            System.out.println("no quiero comer!!!!!!");
        }
    }

    public boolean dormir() {
        System.out.println("voy a dormir estoy cansado!!!");
        return true;
    }

    public boolean despertar() {
        System.out.println("ya me desperte !!!");
        return false;
    }

    public void caminar(Mascota masco) {
        if (masco.getEnergia() > 3 && masco.getPeso() > 3) {
            masco.setEnergia(masco.getEnergia()-3);
            masco.setPeso(masco.getPeso()-3.0);
        } else {
            System.out.println("estoy agotado para caminar");
        }
    }

    public void correr(int energia, Double peso) {
        if (energia > 8 && peso > 8) {
            energia = - 8;
            peso = -8.0;
        } else {
            System.out.println("no puedo correr estoy cansado");
        }
    }

    public void pildoraEnergia(int energia) {
        energia = +20;

    }

    public String humor(int energia, Double peso, int cantComer) {
        if (energia <= 15) {
            return "tengo suenio!!!! CANSADO ";
        }
        if (peso <= 15) {
            return "tengo hambre!!! ENOJADO";

        }
        if (cantComer <= 15) {
            return "tengo hambre!!! ENOJADO";
        } else {
            return "estoy CONTENTO";
        }
    }
    
    public void actualizar(Mascota mascota){
        System.out.println("actaulizacion:" );
        System.out.println("energia: " + mascota.getEnergia() + " peso: " + mascota.getPeso());
        System.out.println("humor: " + mascota.getHumor() + " durmiendo?: " + mascota.isDormido());
    }
        

}
