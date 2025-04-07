/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2;

/**
 *
 * @author WINDOWS 11
 */
public class Juego {
    
    int numeroDeVidas;
    int record;

    public void reiniciaPartida() {
        System.out.println("\n...........Nueva partida..........");
        System.out.println(" tus Vidas disponibles son : " + numeroDeVidas);
    }

    public void actualizaRecord(int intentos) {
        if (record == 0 || intentos < record) {
            record = intentos;
            System.out.println("¡ yeiiii Adivinaste en " + intentos + " intentos ");
        } else {
            System.out.println("Tu récord actual es: " + record + " intentos.");
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("¡ ups Te quedaste sin vidas!");
            return false;
        }
    }
}


