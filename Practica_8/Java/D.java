/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica8;

/**
 *
 * @author WINDOWS 11
 */
public class D implements A, B {
    private int x;
    private int y;
    private int z;

    public D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

   
    @Override
    public void incrementaXZ() {
        x++;
        z++;
    }

   
    @Override
    public void incrementaYZ() {
        y++;
        z++;
    }

   
    @Override
    public void incrementaZ() {
        z++;
    }

    
    public void mostrarValores() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

  
    public void incrementaXYZ() {
        x++;
        y++;
        z++;
    }
}
   
   interface A {
    void incrementaXZ();
    void incrementaZ();
}


interface B {
    void incrementaYZ();
    void incrementaZ();
}




