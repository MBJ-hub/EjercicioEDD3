package com.mycompany.ejercicioedd3;

import java.util.Scanner;

/**
 * Calculates the area of a triangulo.
 * shift+alt+f to Magic. 
 * @author Mario Badallo Jimenez
 */
public class Main {

    /**
     * @param args the comand line arguments
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("¿Cual es el altura del triangulo");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());

        System.out.println("¿Cual es la base del triangulo");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());

        float area = triangle.calculateArea();
        System.out.println("El area del triangulo es: " + area);

        float fixedHeight = 5;
        float fixedBase = 4;

        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El area del triangulo fijado es: " + fixedTriangle.calculateArea());
    }

}
