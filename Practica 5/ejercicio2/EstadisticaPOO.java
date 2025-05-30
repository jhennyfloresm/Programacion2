/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticapoo;

import java.util.Scanner;

public class EstadisticaPOO{
    private double[] numeros;

   
    public EstadisticaPOO(double[] numeros) {
        this.numeros = numeros;
    }

    
    public double calcularPromedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

   
    public double calcularDesviacion() {
        double promedio = calcularPromedio();
        double sumaDiferencias = 0;
        for (double num : numeros) {
            sumaDiferencias += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaDiferencias / (numeros.length - 1));
    }

    public static void main(String[] args) {
        // Definir un array de números predefinidos
        double[] numeros = {2,4,6,3,7,6,9};

        // Crear objeto de la clase Estadisticas
        EstadisticaPOO estadisticas = new EstadisticaPOO(numeros);

        // Obtener resultados
        double promedio = estadisticas.calcularPromedio();
        double desviacion = estadisticas.calcularDesviacion();

        // Mostrar resultados sin formato específico
        System.out.println("El promedio es " + promedio);
        System.out.println("La desviación estándar es " + desviacion);
    }
}



