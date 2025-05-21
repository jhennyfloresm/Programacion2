/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_filal;

/**
 *
 * @author WINDOWS 11
 */
public class Anuncio {
    private int numero;
    private double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void incrementarPrecio(double incremento) {
        this.precio += incremento;
    }

    public void mostrar() {
        System.out.println("Anuncio N° " + numero + ", Precio: " + precio);
    }
}

