/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2_fila1;

/**
 *
 * @author WINDOWS 11
 */
public class Artista {
    private String nombre;
    private String ci;
    private int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Artista: " + nombre + ", CI: " + ci + ", Años experiencia: " + añosExperiencia);
    }
}


