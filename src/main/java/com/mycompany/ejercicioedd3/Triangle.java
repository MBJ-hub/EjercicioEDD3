package com.mycompany.ejercicioedd3;

/**
 * It contains the data of a triangulo and allow us to calculateits area
 *
 * @author Mario Badallo Jimenez version 1.0
 */
public class Triangle {

    private float base;
    private float height;

    public Triangle() {
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    /**
     * this function returns the value of the area of the triangle
     */
    public float calculateArea() {
        return (base * height) / 2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float altura) {
        this.height = altura;
    }

}
