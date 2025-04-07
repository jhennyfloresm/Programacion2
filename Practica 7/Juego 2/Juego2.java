/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego2;

public class Juego2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("\n Juego Adivina Número");
        juego1.juega();

        System.out.println("\n Juego Adivina Par");
        juego2.juega();

        System.out.println("\n Juego Adivina Impar");
        juego3.juega();
    }
}
