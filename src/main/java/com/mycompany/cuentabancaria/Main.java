

package com.mycompany.cuentabancaria;

import java.util.Arrays;
import java.util.Scanner;
import logica.Automovil;
import logica.CuentaBancaria;
import logica.Estudiante;





public class Main {
static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        CuentaBancaria ban = new CuentaBancaria(1627,1000.0);
        
        System.out.println("Saldo inicial: "+ ban.consultarSaldo());
        
        ban.depositar(500);
        System.out.println("Saldo mas deposito: "+ ban.consultarSaldo());
        
        ban.retirar(1000);
        System.out.println("saldo despues de la extraccion: " + ban.consultarSaldo());
        
        ban.retirar(3000);
        System.out.println("Saldo excedido" + ban.consultarSaldo());
        
        System.out.println("-------------------------------------");
        
        double[] calificacionesEdu = {9.0,8.8,7.5};
        Estudiante estu = new Estudiante(32,"Eduardo",calificacionesEdu);
        
        System.out.println("Nombre del estudiante: " + estu.getNombre());
        System.out.println("La edad del estudiante: " + estu.getEdad());
        System.out.println("Sus calificaciones: " + Arrays.toString(estu.getCalificaciones()));
        System.out.println("El promedio de calificaciones es: " + estu.calcularPromedio());
        
        System.out.println("---------------------------------------");
        
        Automovil auto = new Automovil("Renault","Clio",10.0,30.0);
        
        auto.mostrarInformacion();
        
        auto.acelerar(50.0);
        
        auto.frenar(20.0);
        
        auto.mostrarInformacion();
        
        
    }
    
}
