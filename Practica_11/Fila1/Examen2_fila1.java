/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_fila1;
/**
 *
 * @author WINDOWS 11
 */
public class Examen2_fila1 {

    public static void main(String[] args) {
        Artista art1 = new Artista(" joss", "3456", 10);
        Artista art2 = new Artista("gawin", "678", 3);
        Artista art3 = new Artista("howl", "0976", 5);
        Artista art4 = new Artista("pete", "467", 6);

        Anuncio an1 = new Anuncio(1, 600);
        Anuncio an2 = new Anuncio(2, 300);

        Pintura p1 = new Pintura("my golden", "pintura", art1, art2, an1, "horror");
        Pintura p2 = new Pintura("tuna", "olea", art3, art4, an2, "vida");

        p1.mostrar();
        p2.mostrar();

     
        promedioExperiencia(p1, p2);
        incrementarPrecio(p1, "Ana", 100);
        p1.mostrar();
    }

   //iniciso b
    public static void promedioExperiencia(Pintura p1, Pintura p2) {
        int suma = p1.getA1().getAñosExperiencia() + p1.getA2().getAñosExperiencia() +
                   p2.getA1().getAñosExperiencia() + p2.getA2().getAñosExperiencia();
        double promedio = suma / 4.0;
        System.out.println("experiencia " + promedio);
    }

    //inciso c
    public static void incrementarPrecio(Pintura p, String nombreArtista, double incremento) {
        if (p.tieneArtistaConNombre(nombreArtista)) {
            p.getAnuncio().incrementarPrecio(incremento);
            System.out.println("  " + incremento + "   " + nombreArtista);
        } else {
            System.out.println("No se encontró " + nombreArtista);
        }
    }
}
