/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class JuegoAdivinaNumero extends Juego {
    int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 4;
    }

 
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

   
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11);

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean acertado = false;

        while (!acertado && numeroDeVidas > 0) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

           
            if (!validaNumero(intento)) {
                System.out.println("Número inválido.");
                continue;
            }

            intentos++;

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord(intentos);
                acertado = true;
            } else {
                System.out.println("Incorrecto.");
                boolean quedanVidas = quitaVida();

                
                if (quedanVidas) {
                    System.out.println("Pista: El número es " + (intento < numeroAAdivinar ? "mayor." : "menor."));
                } else {
                    System.out.println("El número correcto era: " + numeroAAdivinar);
                }
            }
        }
    }
}


