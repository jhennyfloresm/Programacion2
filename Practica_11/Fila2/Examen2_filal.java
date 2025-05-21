/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_filal;

/**
 *
 * @author WINDOWS 11
 */
public class Examen2_filal {


    public static void main(String[] args) {
        Artista art1 = new Artista(" joss", "3456", 10);
        Artista art2 = new Artista("gawin", "678", 3);
        Artista art3 = new Artista("howl", "0976", 5);
        Artista art4 = new Artista("pete", "467", 6);


        Anuncio anuncio1 = new Anuncio(1, 1000);

       //inciiso a
        Pintura pinturaConAnuncio = new Pintura("Mar", "Acuarela", art1, art2, anuncio1, "Paisaje");
        Pintura pinturaSinAnuncio = new Pintura("Montaña", "Óleo", art3, art4, null, "Naturaleza");

        System.out.println("Pintura con anuncio:");
        pinturaConAnuncio.mostrar();

        System.out.println("\nPintura sin anuncio:");
        pinturaSinAnuncio.mostrar();

        // inciso b
        Artista artistaMayor = encontrarMasExperiencia(pinturaConAnuncio, pinturaSinAnuncio);
        System.out.println("\nArtista con más experiencia: " + artistaMayor.getNombre());

        // c. Agregar anuncio a la pintura sin anuncio y calcular total
        Anuncio nuevoAnuncio = new Anuncio(2, 1200);
        pinturaSinAnuncio.setAnuncio(nuevoAnuncio);

        double total = pinturaConAnuncio.getAnuncio().getPrecio() +
                       pinturaSinAnuncio.getAnuncio().getPrecio();

        System.out.println("\nSe agregó anuncio a la pintura sin anuncio:");
        pinturaSinAnuncio.mostrar();

        System.out.println("\nMonto total de venta: " + total);
    }

    public static Artista encontrarMasExperiencia(Pintura p1, Pintura p2) {
        Artista[] todos = { p1.getA1(), p1.getA2(), p2.getA1(), p2.getA2() };
        Artista max = todos[0];
        for (Artista a : todos) {
            if (a.getAñosExperiencia() > max.getAñosExperiencia()) {
                max = a;
            }
        }
        return max;
    }
}


    