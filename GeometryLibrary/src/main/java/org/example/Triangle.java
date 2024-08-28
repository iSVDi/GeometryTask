package org.example;

public final class Triangle implements Shape{
private final Double a;
private final Double b;
private final Double c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double getArea() {
        Double s = getPerimeter() / 2;
        Double area = Math.sqrt(s * (s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public Double getPerimeter() {
        return a+b+c;
    }
}
