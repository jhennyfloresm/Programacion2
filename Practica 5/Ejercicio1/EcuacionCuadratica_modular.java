
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 11
 */


/**
 *
 * @author WINDOWS 11
 * 
 */


public class EcuacionCuadratica_modular {

    
    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    
    public static double getRaiz1(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    
    public static double getRaiz2(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    
    public static void mostrarResultados(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces:", getRaiz1(a, b, c), getRaiz2(a, b, c));
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una única raíz: ", getRaiz1(a, b, c));
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }

    
  

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese  a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese  b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese  c: ");
        double c = scanner.nextDouble();

       
        mostrarResultados(a, b, c);

        
    }
   
}

