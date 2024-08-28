package org.example;

public final class Circle implements Shape {
    private final Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
