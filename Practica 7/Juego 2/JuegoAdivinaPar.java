/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2;

/**
 *
 * @author WINDOWS 11
 */

    public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

   
   
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) {
            System.out.println("Número fuera de rango.");
            return false;
        }
        if (numero % 2 != 0) {
            System.out.println("Solo se permiten números pares.");
            return false;
        }
        return true;
    }
}
    

