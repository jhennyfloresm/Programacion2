/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_filal;

/**
 *
 * @author WINDOWS 11
 */
public class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio b, String genero) {
        super(titulo, material, a1, a2, b);
        this.genero = genero;
    }

    public String getGenero() { return genero; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Género: " + genero);
    }
}

