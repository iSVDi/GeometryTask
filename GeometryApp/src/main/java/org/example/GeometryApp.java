package org.example;

import java.util.Arrays;

public class GeometryApp {
    public static void main(String[] args) {

        // From Geometry Library
        Triangle triangle = new Triangle(2.0, 3.0, 4.0);
        Circle circle = new Circle(10.0);
        Rectangle rectangle = new Rectangle(10.0, 20.0);

         Arrays.asList(triangle, circle, rectangle).forEach(shape -> {
            System.out.println(shape.toString());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
        });

         // From Geometry Utils
         Circle circle2 = new Circle(20.0);
        System.out.println(ShapeComparator.compareAreas(circle, circle2));

         // From ThreeDimensionalShapes
         Cube cube = new Cube(23.0);
         Sphere sphere = new Sphere(40.0);

        System.out.println(cube.getVolume());
        System.out.println(sphere.getVolume());





    }
}