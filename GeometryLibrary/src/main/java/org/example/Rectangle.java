package org.example;

public final class Rectangle implements Shape {
    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return height * width;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (height + width);
    }
}
