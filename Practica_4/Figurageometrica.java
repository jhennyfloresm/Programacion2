/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areas;

/**
 *
 * @author WINDOWS 11
 */
public class Figurageometrica {
    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    static double calcularArea(double base, double altura) {
        return base * altura;
    }

    static double calcularArea(double base, double altura, boolean esTriangulo) {
         
            return (base * altura) / 2;
        
        
    }
    static double calcularArea(double baseMayor, double baseMenor, double altura, boolean esTrapecio) {
         
            return ((baseMayor + baseMenor) * altura) / 2;
        
      
    }

    static double calcularArea(double lado, double apotema, int lados) {
        
            double perimetro = 5 * lado;
            return (perimetro * apotema) / 2;
        
    }
 public static void main(String[] args) { 
        Figurageometrica f1=new Figurageometrica ();
        Figurageometrica f2=new Figurageometrica ();
        Figurageometrica f3=new Figurageometrica ();
        Figurageometrica f4=new Figurageometrica ();
        Figurageometrica f5=new Figurageometrica ();

        System.out.println("Área del círculo: " + f1.calcularArea(5));
        System.out.println("Área del rectángulo: " + f2.calcularArea(4, 6));
        System.out.println("Área del triángulo rectángulo: " + f3.calcularArea(3, 4, true));
        System.out.println("Área del trapecio: " + f4.calcularArea(6, 4, 5, true));
        System.out.println("Área del pentágono: " + f5.calcularArea(4, 3, 5));
    }
}








