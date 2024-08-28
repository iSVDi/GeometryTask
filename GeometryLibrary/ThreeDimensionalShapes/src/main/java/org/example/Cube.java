package org.example;

public final class Cube implements ThreeDimensionalShapes{
    private final Double side;

    public Cube(Double side) {
        this.side = side;
    }

    @Override
    public Double getVolume() {
        return Math.pow(side, 3.0);
    }
}
