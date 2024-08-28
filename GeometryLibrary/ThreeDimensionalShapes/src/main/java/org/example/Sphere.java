package org.example;

public final class Sphere implements ThreeDimensionalShapes{

    private final Double radius;

    public Sphere(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getVolume() {
        return (4 * Math.PI * radius * radius) / 3;
    }
}
