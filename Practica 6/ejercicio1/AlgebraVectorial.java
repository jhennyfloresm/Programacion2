/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algebravectorial;

/**
 *
 * @author WINDOWS 11
 */
import java.util.Arrays;

public class AlgebraVectorial {
    private double[] a;
    private double[] b;

    public AlgebraVectorial() {
        this.a = new double[]{0, 0, 0};
        this.b = new double[]{0, 0, 0};
    }

    public AlgebraVectorial(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    public double perpendiculares() {
        return a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
    }

    public double perpendiculares(double[] v1, double[] v2) {
        return v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2];
    }

    public double perpendiculares(double[] v1) {
        return v1[0] * b[0] + v1[1] * b[1] + v1[2] * b[2];
    }

    public double perpendiculares(double[] v1, double[] v2, double[] v3) {
        return (v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]) - 
               (v1[0] * v3[0] + v1[1] * v3[1] + v1[2] * v3[2]);
    }

    public boolean esParalelo() {
        double crossProductX = a[1] * b[2] - a[2] * b[1];
        double crossProductY = a[2] * b[0] - a[0] * b[2];
        double crossProductZ = a[0] * b[1] - a[1] * b[0];
        return crossProductX == 0 && crossProductY == 0 && crossProductZ == 0;
    }

    public boolean esParalelo(double[] v1, double[] v2) {
        double crossProductX = v1[1] * v2[2] - v1[2] * v2[1];
        double crossProductY = v1[2] * v2[0] - v1[0] * v2[2];
        double crossProductZ = v1[0] * v2[1] - v1[1] * v2[0];
        return crossProductX == 0 && crossProductY == 0 && crossProductZ == 0;
    }

    public double[] proyeccionDeASobreB() {
        double escalar = (a[0] * b[0] + a[1] * b[1] + a[2] * b[2]) / 
                         (b[0] * b[0] + b[1] * b[1] + b[2] * b[2]);
        return new double[]{escalar * b[0], escalar * b[1], escalar * b[2]};
    }

    public double[] proyeccionDeASobreB(double[] v1, double[] v2) {
        double escalar = (v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]) / 
                         (v2[0] * v2[0] + v2[1] * v2[1] + v2[2] * v2[2]);
        return new double[]{escalar * v2[0], escalar * v2[1], escalar * v2[2]};
    }

    public double componenteDeAEnB() {
        double normaB = Math.sqrt(b[0] * b[0] + b[1] * b[1] + b[2] * b[2]);
        return (a[0] * b[0] + a[1] * b[1] + a[2] * b[2]) / normaB;
    }

    public double componenteDeAEnB(double[] v1, double[] v2) {
        double normaV2 = Math.sqrt(v2[0] * v2[0] + v2[1] * v2[1] + v2[2] * v2[2]);
        return (v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2]) / normaV2;
    }

    public static void main(String[] args) {
        double[] a = {9,-3, 6};
        double[] b = {3, -4, 5};

        AlgebraVectorial algebra = new AlgebraVectorial(a, b);
        System.out.println("dos vectors son paralelos: " + algebra.perpendiculares());
        System.out.println("son paralelos? " + algebra.esParalelo());
        System.out.println("Proyección de a sobre b: " + Arrays.toString(algebra.proyeccionDeASobreB()));
        System.out.println("Componente de a en la dirección de b: " + algebra.componenteDeAEnB());
    }
}


