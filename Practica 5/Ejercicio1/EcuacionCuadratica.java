/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacioncuadraticpoo;

/**
 *
 * @author WINDOWS 11
 */
public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public double getRaiz1() {
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public double getRaiz2() {
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public void resolver() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces ", getRaiz1(), getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una raíz ", getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
    
    
       public static void main(String[] args) { 
        EcuacionCuadratica ecuacion1 = new EcuacionCuadratica(1.0, 3, 1);
        EcuacionCuadratica ecuacion2 = new EcuacionCuadratica(1, 2, 1);
        EcuacionCuadratica ecuacion3 = new EcuacionCuadratica(1, 2, 3);

        
        ecuacion1.resolver();
        ecuacion2.resolver();
        ecuacion3.resolver();
    }
}


    

