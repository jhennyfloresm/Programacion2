/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_fila1;

/**
 *
 * @author WINDOWS 11
 */
public class Obra {
    protected String titulo;
    protected String material;
    protected Artista a1;
    protected Artista a2;
    protected Anuncio b;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio b) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.b = b;
    }

    public Artista getA1() {
        return a1;
    }

    public Artista getA2() {
        return a2;
    }

    public Anuncio getAnuncio() {
        return b;
    }

    public void mostrar() {
        System.out.println("Obra: " + titulo + ", Material: " + material);
        a1.mostrar();
        a2.mostrar();
        b.mostrar();
    }
}



