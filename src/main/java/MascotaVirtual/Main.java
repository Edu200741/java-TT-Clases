package MascotaVirtual;

import java.util.Scanner;

public class Main {

    public static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Mascota mascota = new Mascota();
        int opcion;

        System.out.println("bien venido a tu Mascota Virtual!!!");
        System.out.println("Ingrese por favor el nombre de su nueva mascota !!!");
        System.out.println(" ");
        mascota.setNombre(teclado.next());
        mascota.setEnergia(100);
        mascota.setDormido(false);
        mascota.setPeso(100.0);
        System.out.println("");
        System.out.println("la informacion de tu nueva Mascota es: ");
        System.out.println("nombre: " + mascota.getNombre());
        System.out.println("energia: " + mascota.getEnergia());
        System.out.println("peso: " + mascota.getPeso());
        System.out.println(" ");

        do {

            System.out.println("---------------empecemos--------------");
            System.out.println(" ");
            System.out.println("1. caminar");
            System.out.println("2. correr");
            System.out.println("3. comer");
            System.out.println("4. dormir");
            System.out.println("5. despertar");
            System.out.println("6. pildora Energia");
            System.out.println("7. mi humor ?");
            System.out.println("8. adios nos vemos Luego");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    mascota.caminar(mascota);
                    mascota.actualizar(mascota);
                    System.out.println("Esta caminando......");
                    break;
                case 2:
                    mascota.correr(mascota.getEnergia(), mascota.getPeso());
                    break;
                case 3:
                    mascota.comer(mascota.getEnergia(), mascota.getCantComer(), mascota.getPeso());
                    break;
                case 4:
                    mascota.dormir();
                    break;
                case 5:
                    mascota.despertar();
                    break;
                case 6:
                    mascota.pildoraEnergia(mascota.getEnergia());
                    break;
                case 7:
                    mascota.humor(mascota.getEnergia(), mascota.getPeso(), mascota.getCantComer());
                case 8:
                    System.out.println("Adios vuelve pronto");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }

        } while (opcion != 8);

    }
}
