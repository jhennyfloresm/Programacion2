/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avectorial_ej2;

/**
 *
 * @author WINDOWS 11
 */
class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D escalar(double r) {
        return new Vector3D(this.x * r, this.y * r, this.z * r);
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalizar() {
        double mag = magnitud();
        return mag == 0 ? new Vector3D(0, 0, 0) : new Vector3D(x / mag, y / mag, z / mag);
    }

    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector3D productoVectorial(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.println("Suma: " + a.suma(b));
        System.out.println("Multiplicación por escalar (2): " + a.escalar(2));
        System.out.println("Magnitud de a: " + a.magnitud());
        System.out.println("Vector normalizado a: " + a.normalizar());
        System.out.println("Producto escalar: " + a.productoEscalar(b));
        System.out.println("Producto vectorial: " + a.productoVectorial(b));
    }
}